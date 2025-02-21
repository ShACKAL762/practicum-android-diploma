package ru.practicum.android.diploma.search.domain.api

import kotlinx.coroutines.flow.Flow
import ru.practicum.android.diploma.search.domain.models.VacancyListResponseData
import ru.practicum.android.diploma.util.Resource

interface SearchVacancyRepository {
    fun getVacancyList(query: HashMap<String, String>): Flow<Resource<VacancyListResponseData>>
}
