package com.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SchoolGroup

public val SchoolGroup.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(name = "Document", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(4.0f, 20.6569f, 5.3432f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(18.6569f, 22.0f, 20.0f, 20.6569f, 20.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(20.0f, 7.3432f, 18.6569f, 6.0f, 17.0f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 6.0f, 4.0f, 5.5523f, 4.0f, 5.0f)
                close()
                moveTo(7.25f, 12.0f)
                curveTo(7.25f, 11.5858f, 7.5858f, 11.25f, 8.0f, 11.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 11.25f, 16.75f, 11.5858f, 16.75f, 12.0f)
                curveTo(16.75f, 12.4142f, 16.4142f, 12.75f, 16.0f, 12.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 12.75f, 7.25f, 12.4142f, 7.25f, 12.0f)
                close()
                moveTo(7.25f, 15.5f)
                curveTo(7.25f, 15.0858f, 7.5858f, 14.75f, 8.0f, 14.75f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 14.75f, 14.25f, 15.0858f, 14.25f, 15.5f)
                curveTo(14.25f, 15.9142f, 13.9142f, 16.25f, 13.5f, 16.25f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 16.25f, 7.25f, 15.9142f, 7.25f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.4088f, 4.0871f)
                curveTo(4.7573f, 4.2434f, 5.0f, 4.5933f, 5.0f, 5.0f)
                horizontalLineTo(17.0f)
                curveTo(17.3453f, 5.0f, 17.6804f, 5.0437f, 18.0f, 5.126f)
                verticalLineTo(4.306f)
                curveTo(18.0f, 3.0889f, 16.922f, 2.154f, 15.7172f, 2.3261f)
                lineTo(4.9196f, 3.8686f)
                curveTo(4.7271f, 3.8962f, 4.5527f, 3.9737f, 4.4088f, 4.0871f)
                close()
            }
        }
        .build()
        return _document!!
    }

private var _document: ImageVector? = null
