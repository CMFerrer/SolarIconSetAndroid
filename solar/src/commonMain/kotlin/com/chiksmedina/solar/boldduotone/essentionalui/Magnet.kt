package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(
            name = "Magnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(7.4771f, 2.0f, 3.0f, 6.4771f, 3.0f, 12.0f)
                curveTo(3.0f, 17.5228f, 7.4771f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                curveTo(10.2386f, 17.0f, 8.0f, 14.7614f, 8.0f, 12.0f)
                curveTo(8.0f, 9.2386f, 10.2386f, 7.0f, 13.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 7.0f)
                horizontalLineTo(19.5f)
                curveTo(20.3284f, 7.0f, 21.0f, 6.3284f, 21.0f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(21.0f, 2.6716f, 20.3284f, 2.0f, 19.5f, 2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.5f)
                curveTo(20.3284f, 22.0f, 21.0f, 21.3284f, 21.0f, 20.5f)
                verticalLineTo(18.5f)
                curveTo(21.0f, 17.6716f, 20.3284f, 17.0f, 19.5f, 17.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
            .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
