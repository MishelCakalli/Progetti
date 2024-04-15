export interface Movie {
    id: number;
    title: string;
    overview: string;
    release_date: string;
    poster_path: string;
    backdrop_path: string;
    genre_ids: number[];
    vote_average: number;
    vote_count: number;
    adult: boolean;
    original_language: string;
    video: boolean;
  }
  