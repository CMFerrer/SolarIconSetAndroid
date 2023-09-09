package com.chiksmedina.solar.bold.sports

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
import com.chiksmedina.solar.bold.SportsGroup

public val SportsGroup.WaterSun: ImageVector
    get() {
        if (_waterSun != null) {
            return _waterSun!!
        }
        _waterSun = Builder(name = "WaterSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4143f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(3.0f)
                curveTo(12.75f, 3.4142f, 12.4143f, 3.75f, 12.0f, 3.75f)
                curveTo(11.5858f, 3.75f, 11.25f, 3.4142f, 11.25f, 3.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(4.3991f, 4.3986f)
                curveTo(4.692f, 4.1057f, 5.1669f, 4.1057f, 5.4598f, 4.3986f)
                lineTo(5.8526f, 4.7915f)
                curveTo(6.1455f, 5.0843f, 6.1455f, 5.5592f, 5.8526f, 5.8521f)
                curveTo(5.5598f, 6.145f, 5.0849f, 6.145f, 4.792f, 5.8521f)
                lineTo(4.3991f, 5.4593f)
                curveTo(4.1062f, 5.1664f, 4.1062f, 4.6915f, 4.3991f, 4.3986f)
                close()
                moveTo(19.6007f, 4.3989f)
                curveTo(19.8936f, 4.6918f, 19.8936f, 5.1666f, 19.6007f, 5.4595f)
                lineTo(19.2079f, 5.8524f)
                curveTo(18.915f, 6.1453f, 18.4401f, 6.1453f, 18.1472f, 5.8524f)
                curveTo(17.8543f, 5.5595f, 17.8543f, 5.0846f, 18.1472f, 4.7917f)
                lineTo(18.54f, 4.3989f)
                curveTo(18.8329f, 4.106f, 19.3078f, 4.106f, 19.6007f, 4.3989f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0001f, 11.25f)
                horizontalLineTo(3.0001f)
                curveTo(3.4143f, 11.25f, 3.7501f, 11.5858f, 3.7501f, 12.0f)
                curveTo(3.7501f, 12.4142f, 3.4143f, 12.75f, 3.0001f, 12.75f)
                horizontalLineTo(2.0001f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                close()
                moveTo(20.25f, 12.0f)
                curveTo(20.25f, 11.5858f, 20.5858f, 11.25f, 21.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4143f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4143f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(21.0f)
                curveTo(20.5858f, 12.75f, 20.25f, 12.4142f, 20.25f, 12.0f)
                close()
                moveTo(4.5699f, 18.8657f)
                curveTo(5.2568f, 17.7919f, 6.7274f, 17.8271f, 7.4576f, 18.7618f)
                curveTo(8.4476f, 20.0291f, 9.8295f, 21.25f, 12.0f, 21.25f)
                curveTo(14.2087f, 21.25f, 15.5698f, 20.2712f, 16.505f, 19.0209f)
                curveTo(17.225f, 18.0585f, 18.7907f, 17.9013f, 19.5456f, 19.0435f)
                curveTo(20.1707f, 19.9891f, 20.8487f, 20.7306f, 22.1721f, 21.0424f)
                curveTo(22.5752f, 21.1374f, 22.8251f, 21.5412f, 22.7301f, 21.9444f)
                curveTo(22.6351f, 22.3476f, 22.2312f, 22.5974f, 21.828f, 22.5024f)
                curveTo(19.9761f, 22.066f, 19.0204f, 20.9692f, 18.2943f, 19.8705f)
                curveTo(18.2373f, 19.7844f, 18.1517f, 19.7406f, 18.0407f, 19.7427f)
                curveTo(17.9221f, 19.7449f, 17.7935f, 19.8027f, 17.7061f, 19.9195f)
                curveTo(16.5385f, 21.4804f, 14.7603f, 22.75f, 12.0f, 22.75f)
                curveTo(9.1575f, 22.75f, 7.3886f, 21.1101f, 6.2755f, 19.6853f)
                curveTo(6.2038f, 19.5934f, 6.1102f, 19.5585f, 6.0297f, 19.5602f)
                curveTo(5.9538f, 19.5619f, 5.8843f, 19.5946f, 5.8335f, 19.674f)
                curveTo(5.094f, 20.8301f, 4.1392f, 22.0389f, 2.1721f, 22.5024f)
                curveTo(1.7689f, 22.5974f, 1.365f, 22.3476f, 1.27f, 21.9444f)
                curveTo(1.175f, 21.5412f, 1.4249f, 21.1374f, 1.828f, 21.0424f)
                curveTo(3.229f, 20.7123f, 3.9076f, 19.9011f, 4.5699f, 18.8657f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1721f, 16.0424f)
                curveTo(20.8487f, 15.7306f, 20.1707f, 14.9891f, 19.5456f, 14.0435f)
                curveTo(19.1369f, 13.425f, 18.4904f, 13.1875f, 17.8691f, 13.2526f)
                curveTo(17.9549f, 12.8486f, 18.0f, 12.4296f, 18.0f, 12.0f)
                curveTo(18.0f, 8.6863f, 15.3138f, 6.0f, 12.0f, 6.0f)
                curveTo(8.6863f, 6.0f, 6.0001f, 8.6863f, 6.0001f, 12.0f)
                curveTo(6.0001f, 12.3623f, 6.0322f, 12.7171f, 6.0937f, 13.0617f)
                curveTo(5.5169f, 13.0396f, 4.9335f, 13.2972f, 4.5699f, 13.8657f)
                curveTo(3.9076f, 14.9011f, 3.229f, 15.7123f, 1.828f, 16.0424f)
                curveTo(1.4249f, 16.1374f, 1.175f, 16.5412f, 1.27f, 16.9444f)
                curveTo(1.365f, 17.3476f, 1.7689f, 17.5974f, 2.1721f, 17.5024f)
                curveTo(4.1392f, 17.0389f, 5.094f, 15.8301f, 5.8335f, 14.674f)
                curveTo(5.8843f, 14.5946f, 5.9538f, 14.5619f, 6.0297f, 14.5602f)
                curveTo(6.1102f, 14.5585f, 6.2038f, 14.5934f, 6.2755f, 14.6853f)
                curveTo(7.3886f, 16.1101f, 9.1575f, 17.75f, 12.0f, 17.75f)
                curveTo(14.7603f, 17.75f, 16.5385f, 16.4804f, 17.7061f, 14.9195f)
                curveTo(17.7935f, 14.8027f, 17.9221f, 14.7449f, 18.0407f, 14.7427f)
                curveTo(18.1517f, 14.7406f, 18.2373f, 14.7844f, 18.2943f, 14.8705f)
                curveTo(19.0204f, 15.9692f, 19.9761f, 17.066f, 21.828f, 17.5024f)
                curveTo(22.2312f, 17.5974f, 22.6351f, 17.3476f, 22.7301f, 16.9444f)
                curveTo(22.8251f, 16.5412f, 22.5752f, 16.1374f, 22.1721f, 16.0424f)
                close()
            }
        }
        .build()
        return _waterSun!!
    }

private var _waterSun: ImageVector? = null
