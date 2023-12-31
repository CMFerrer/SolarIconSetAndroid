package com.chiksmedina.solar.linear.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.AstronomyGroup

val AstronomyGroup.Planet4: ImageVector
    get() {
        if (_planet4 != null) {
            return _planet4!!
        }
        _planet4 = Builder(
            name = "Planet4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 14.0f)
                curveTo(18.0f, 18.4183f, 14.4183f, 22.0f, 10.0f, 22.0f)
                curveTo(5.5817f, 22.0f, 2.0f, 18.4183f, 2.0f, 14.0f)
                curveTo(2.0f, 9.5817f, 5.5817f, 6.0f, 10.0f, 6.0f)
                curveTo(14.4183f, 6.0f, 18.0f, 9.5817f, 18.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 11.0051f)
                curveTo(3.0f, 11.0051f, 5.2845f, 13.0f, 8.7845f, 13.0f)
                curveTo(11.1667f, 13.0f, 12.4311f, 11.8179f, 13.5f, 11.5038f)
                curveTo(15.5089f, 10.9135f, 17.0f, 11.0051f, 17.0f, 11.0051f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 16.0051f)
                curveTo(3.0f, 16.0051f, 4.6007f, 15.9135f, 6.7572f, 16.5038f)
                curveTo(7.9047f, 16.8179f, 9.262f, 18.0f, 11.8193f, 18.0f)
                curveTo(14.1272f, 18.0f, 15.9427f, 17.2473f, 17.0f, 16.6667f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.5301f, 4.0447f)
                curveTo(20.4935f, 3.9506f, 20.4492f, 3.8581f, 20.3972f, 3.768f)
                curveTo(20.3451f, 3.6778f, 20.2871f, 3.5932f, 20.2239f, 3.5145f)
                curveTo(20.5503f, 3.4237f, 20.7725f, 3.4181f, 20.8302f, 3.518f)
                curveTo(20.8879f, 3.6178f, 20.7719f, 3.8075f, 20.5301f, 4.0447f)
                close()
                moveTo(17.1063f, 6.0214f)
                curveTo(16.7799f, 6.1122f, 16.5577f, 6.1178f, 16.5001f, 6.018f)
                curveTo(16.4424f, 5.9181f, 16.5584f, 5.7284f, 16.8002f, 5.4912f)
                curveTo(16.8368f, 5.5853f, 16.881f, 5.6778f, 16.9331f, 5.768f)
                curveTo(16.9851f, 5.8581f, 17.0431f, 5.9427f, 17.1063f, 6.0214f)
                close()
                moveTo(17.1063f, 6.0214f)
                curveTo(17.5613f, 5.8949f, 18.2188f, 5.603f, 18.9151f, 5.201f)
                curveTo(19.6114f, 4.799f, 20.193f, 4.3755f, 20.5301f, 4.0447f)
                curveTo(20.8821f, 4.9491f, 20.5316f, 5.9998f, 19.6651f, 6.5f)
                curveTo(18.7987f, 7.0002f, 17.7135f, 6.7785f, 17.1063f, 6.0214f)
                close()
                moveTo(16.8002f, 5.4912f)
                curveTo(16.4482f, 4.5868f, 16.7987f, 3.5361f, 17.6651f, 3.0359f)
                curveTo(18.5316f, 2.5357f, 19.6167f, 2.7574f, 20.2239f, 3.5145f)
                curveTo(19.7689f, 3.641f, 19.1114f, 3.9329f, 18.4151f, 4.3349f)
                curveTo(17.7188f, 4.7369f, 17.1372f, 5.1604f, 16.8002f, 5.4912f)
                close()
            }
        }
            .build()
        return _planet4!!
    }

private var _planet4: ImageVector? = null
