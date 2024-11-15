package com.green.madang.manager.book;

import com.green.madang.manager.book.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookMapper mapper;

    public int insBook(BookPostReq p) {
        return mapper.insBook(p);
    }

    public List<BookGetRes> selBookList(BookGetReq p) {
        //sIdx값 세팅 (logic 처리는 service딴에서 한다)
        p.setStartIdx((p.getPage() - 1) * p.getSize());
        return mapper.selBookList(p);
    }

    public int updBook(BookUpdReq p) {
        return mapper.updBook(p);
    }

    public int delBook(BookDeleteReq p) {
        return mapper.delBook(p);
    }
}
