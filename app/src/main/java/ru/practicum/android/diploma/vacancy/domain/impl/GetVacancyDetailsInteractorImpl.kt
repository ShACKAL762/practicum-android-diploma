package ru.practicum.android.diploma.vacancy.domain.impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import ru.practicum.android.diploma.util.Resource
import ru.practicum.android.diploma.vacancy.domain.api.GetVacancyDetailsInteractor
import ru.practicum.android.diploma.vacancy.domain.api.GetVacancyDetailsRepository
import ru.practicum.android.diploma.vacancy.domain.entity.Vacancy

class GetVacancyDetailsInteractorImpl(
    private val repository: GetVacancyDetailsRepository
) : GetVacancyDetailsInteractor {
    override fun getVacancyDetails(vacancyId: String): Flow<Resource<Vacancy>?> {
        return repository.getVacancyDetails(vacancyId).map { result ->
            when (result) {
                is Resource.Error -> result
                is Resource.Success -> null
            }
        }
    }
}
