package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.EssentionalUiGroup

public val EssentionalUiGroup.HighQuality: ImageVector
    get() {
        if (_highQuality != null) {
            return _highQuality!!
        }
        _highQuality = Builder(name = "HighQuality", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                verticalLineTo(15.619f)
                moveTo(10.8148f, 8.0f)
                verticalLineTo(15.619f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(10.8148f)
                moveTo(19.0f, 16.0f)
                lineTo(17.0741f, 14.4762f)
                moveTo(16.1111f, 15.619f)
                curveTo(15.6637f, 15.619f, 15.4399f, 15.619f, 15.2539f, 15.5898f)
                curveTo(14.4899f, 15.4695f, 13.8927f, 14.997f, 13.7407f, 14.3925f)
                curveTo(13.7037f, 14.2453f, 13.7037f, 14.0683f, 13.7037f, 13.7143f)
                verticalLineTo(9.9048f)
                curveTo(13.7037f, 9.5507f, 13.7037f, 9.3737f, 13.7407f, 9.2265f)
                curveTo(13.8927f, 8.6221f, 14.4899f, 8.1495f, 15.2539f, 8.0293f)
                curveTo(15.4399f, 8.0f, 15.6637f, 8.0f, 16.1111f, 8.0f)
                curveTo(16.5586f, 8.0f, 16.7823f, 8.0f, 16.9683f, 8.0293f)
                curveTo(17.7323f, 8.1495f, 18.3295f, 8.6221f, 18.4815f, 9.2265f)
                curveTo(18.5185f, 9.3737f, 18.5185f, 9.5507f, 18.5185f, 9.9048f)
                verticalLineTo(13.7143f)
                curveTo(18.5185f, 14.0683f, 18.5185f, 14.2453f, 18.4815f, 14.3925f)
                curveTo(18.3295f, 14.997f, 17.7323f, 15.4695f, 16.9683f, 15.5898f)
                curveTo(16.7823f, 15.619f, 16.5586f, 15.619f, 16.1111f, 15.619f)
                close()
            }
        }
        .build()
        return _highQuality!!
    }

private var _highQuality: ImageVector? = null
