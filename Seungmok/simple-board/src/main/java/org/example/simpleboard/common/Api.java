package org.example.simpleboard.common;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Api<T> {

    private T body;

    private Pagination pagination;
}
