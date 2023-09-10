package com.chiksmedina.solar.linear.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.HomeFurnitureGroup

val HomeFurnitureGroup.Condicioner2: ImageVector
    get() {
        if (_condicioner2 != null) {
            return _condicioner2!!
        }
        _condicioner2 = Builder(
            name = "Condicioner2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 11.0f)
                curveTo(2.0f, 8.1716f, 2.0f, 6.7574f, 2.8787f, 5.8787f)
                curveTo(3.7574f, 5.0f, 5.1716f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 5.0f, 20.2426f, 5.0f, 21.1213f, 5.8787f)
                curveTo(22.0f, 6.7574f, 22.0f, 8.1716f, 22.0f, 11.0f)
                curveTo(22.0f, 14.7712f, 22.0f, 16.6569f, 20.8284f, 17.8284f)
                curveTo(19.6569f, 19.0f, 17.7712f, 19.0f, 14.0f, 19.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 19.0f, 4.3432f, 19.0f, 3.1716f, 17.8284f)
                curveTo(2.0f, 16.6569f, 2.0f, 14.7712f, 2.0f, 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 18.5f)
                curveTo(18.0f, 17.0955f, 18.0f, 16.3933f, 17.6629f, 15.8889f)
                curveTo(17.517f, 15.6705f, 17.3295f, 15.483f, 17.1111f, 15.3371f)
                curveTo(16.6067f, 15.0f, 15.9045f, 15.0f, 14.5f, 15.0f)
                horizontalLineTo(9.5f)
                curveTo(8.0955f, 15.0f, 7.3933f, 15.0f, 6.8889f, 15.3371f)
                curveTo(6.6705f, 15.483f, 6.483f, 15.6705f, 6.3371f, 15.8889f)
                curveTo(6.0f, 16.3933f, 6.0f, 17.0955f, 6.0f, 18.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 11.5f)
                horizontalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 9.0f)
                horizontalLineTo(18.0f)
            }
        }
            .build()
        return _condicioner2!!
    }

private var _condicioner2: ImageVector? = null
