package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 2.75f)
                curveTo(7.8914f, 2.75f, 3.75f, 6.8914f, 3.75f, 12.0f)
                curveTo(3.75f, 17.1086f, 7.8914f, 21.25f, 13.0f, 21.25f)
                horizontalLineTo(16.25f)
                verticalLineTo(17.75f)
                horizontalLineTo(13.0f)
                curveTo(9.8244f, 17.75f, 7.25f, 15.1756f, 7.25f, 12.0f)
                curveTo(7.25f, 8.8244f, 9.8244f, 6.25f, 13.0f, 6.25f)
                horizontalLineTo(16.25f)
                verticalLineTo(2.75f)
                horizontalLineTo(13.0f)
                close()
                moveTo(17.75f, 2.75f)
                verticalLineTo(6.25f)
                horizontalLineTo(19.5f)
                curveTo(19.9142f, 6.25f, 20.25f, 5.9142f, 20.25f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(20.25f, 3.0858f, 19.9142f, 2.75f, 19.5f, 2.75f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.75f, 17.75f)
                verticalLineTo(21.25f)
                horizontalLineTo(19.5f)
                curveTo(19.9142f, 21.25f, 20.25f, 20.9142f, 20.25f, 20.5f)
                verticalLineTo(18.5f)
                curveTo(20.25f, 18.0858f, 19.9142f, 17.75f, 19.5f, 17.75f)
                horizontalLineTo(17.75f)
                close()
                moveTo(2.25f, 12.0f)
                curveTo(2.25f, 6.0629f, 7.0629f, 1.25f, 13.0f, 1.25f)
                horizontalLineTo(19.5f)
                curveTo(20.7426f, 1.25f, 21.75f, 2.2574f, 21.75f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(21.75f, 6.7426f, 20.7426f, 7.75f, 19.5f, 7.75f)
                horizontalLineTo(13.0f)
                curveTo(10.6528f, 7.75f, 8.75f, 9.6528f, 8.75f, 12.0f)
                curveTo(8.75f, 14.3472f, 10.6528f, 16.25f, 13.0f, 16.25f)
                horizontalLineTo(19.5f)
                curveTo(20.7426f, 16.25f, 21.75f, 17.2574f, 21.75f, 18.5f)
                verticalLineTo(20.5f)
                curveTo(21.75f, 21.7426f, 20.7426f, 22.75f, 19.5f, 22.75f)
                horizontalLineTo(13.0f)
                curveTo(7.0629f, 22.75f, 2.25f, 17.9371f, 2.25f, 12.0f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
