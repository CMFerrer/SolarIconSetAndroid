package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

public val EssentionalUiGroup.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                horizontalLineTo(19.5f)
                curveTo(20.3284f, 2.0f, 21.0f, 2.6716f, 21.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(21.0f, 6.3284f, 20.3284f, 7.0f, 19.5f, 7.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(11.5778f, 2.0f, 10.2249f, 2.2969f, 9.0f, 2.8321f)
                moveTo(17.0f, 2.0f)
                verticalLineTo(7.0f)
                moveTo(17.0f, 7.0f)
                horizontalLineTo(13.0f)
                curveTo(10.2386f, 7.0f, 8.0f, 9.2386f, 8.0f, 12.0f)
                curveTo(8.0f, 13.1258f, 8.3721f, 14.1647f, 9.0f, 15.0005f)
                moveTo(17.0f, 17.0f)
                horizontalLineTo(19.5f)
                curveTo(20.3284f, 17.0f, 21.0f, 17.6716f, 21.0f, 18.5f)
                verticalLineTo(20.5f)
                curveTo(21.0f, 21.3284f, 20.3284f, 22.0f, 19.5f, 22.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 17.0f)
                horizontalLineTo(13.0f)
                moveTo(17.0f, 17.0f)
                verticalLineTo(22.0f)
                moveTo(17.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(7.4771f, 22.0f, 3.0f, 17.5228f, 3.0f, 12.0f)
                curveTo(3.0f, 9.7484f, 3.7442f, 7.6705f, 5.0f, 5.999f)
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
