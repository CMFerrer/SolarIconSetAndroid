package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Sort: ImageVector
    get() {
        if (_sort != null) {
            return _sort!!
        }
        _sort = Builder(name = "Sort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.75f, 7.0f)
                curveTo(22.75f, 7.4142f, 22.4142f, 7.75f, 22.0f, 7.75f)
                lineTo(2.0f, 7.75f)
                curveTo(1.5858f, 7.75f, 1.25f, 7.4142f, 1.25f, 7.0f)
                curveTo(1.25f, 6.5858f, 1.5858f, 6.25f, 2.0f, 6.25f)
                lineTo(22.0f, 6.25f)
                curveTo(22.4142f, 6.25f, 22.75f, 6.5858f, 22.75f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.75f, 12.0f)
                curveTo(19.75f, 12.4142f, 19.4142f, 12.75f, 19.0f, 12.75f)
                lineTo(5.0f, 12.75f)
                curveTo(4.5858f, 12.75f, 4.25f, 12.4142f, 4.25f, 12.0f)
                curveTo(4.25f, 11.5858f, 4.5858f, 11.25f, 5.0f, 11.25f)
                lineTo(19.0f, 11.25f)
                curveTo(19.4142f, 11.25f, 19.75f, 11.5858f, 19.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.75f, 17.0f)
                curveTo(16.75f, 17.4142f, 16.4142f, 17.75f, 16.0f, 17.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 17.75f, 7.25f, 17.4142f, 7.25f, 17.0f)
                curveTo(7.25f, 16.5858f, 7.5858f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 16.25f, 16.75f, 16.5858f, 16.75f, 17.0f)
                close()
            }
        }
        .build()
        return _sort!!
    }

private var _sort: ImageVector? = null
