package dev.chiksmedina.solar.boldduotone.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.SportsGroup

val SportsGroup.Walking: ImageVector
    get() {
        if (_walking != null) {
            return _walking!!
        }
        _walking = Builder(
            name = "Walking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.5278f, 10.7532f)
                curveTo(12.4897f, 10.7505f, 12.4419f, 10.75f, 12.2698f, 10.75f)
                horizontalLineTo(11.1787f)
                lineTo(11.0875f, 11.6615f)
                curveTo(10.9135f, 13.4019f, 10.8529f, 14.1013f, 11.0084f, 14.7631f)
                curveTo(11.1639f, 15.4248f, 11.5295f, 16.024f, 12.4604f, 17.5048f)
                lineTo(15.0353f, 21.6009f)
                curveTo(15.2557f, 21.9515f, 15.1501f, 22.4145f, 14.7995f, 22.635f)
                curveTo(14.4488f, 22.8554f, 13.9858f, 22.7498f, 13.7653f, 22.3992f)
                lineTo(11.1905f, 18.3032f)
                curveTo(11.166f, 18.2642f, 11.1418f, 18.2256f, 11.1178f, 18.1875f)
                curveTo(10.2829f, 16.8599f, 9.7678f, 16.0407f, 9.5482f, 15.1061f)
                curveTo(9.3286f, 14.1716f, 9.425f, 13.2086f, 9.5813f, 11.6482f)
                curveTo(9.5858f, 11.6034f, 9.5904f, 11.5581f, 9.5949f, 11.5123f)
                lineTo(9.6711f, 10.7509f)
                curveTo(9.1699f, 10.7535f, 8.7992f, 10.7632f, 8.4999f, 10.7995f)
                curveTo(8.1227f, 10.8453f, 7.9467f, 10.925f, 7.8221f, 11.025f)
                curveTo(7.6975f, 11.1249f, 7.5815f, 11.2794f, 7.455f, 11.6377f)
                curveTo(7.3217f, 12.0153f, 7.2069f, 12.526f, 7.036f, 13.295f)
                lineTo(6.7321f, 14.6627f)
                curveTo(6.6422f, 15.0671f, 6.2416f, 15.322f, 5.8372f, 15.2321f)
                curveTo(5.4329f, 15.1423f, 5.1779f, 14.7417f, 5.2678f, 14.3373f)
                lineTo(5.5815f, 12.9257f)
                curveTo(5.74f, 12.2123f, 5.8734f, 11.6118f, 6.0406f, 11.1382f)
                curveTo(6.218f, 10.6357f, 6.4597f, 10.1948f, 6.8835f, 9.8549f)
                curveTo(7.3073f, 9.5149f, 7.7901f, 9.3747f, 8.3191f, 9.3105f)
                curveTo(8.8177f, 9.25f, 9.4328f, 9.25f, 10.1636f, 9.25f)
                lineTo(12.2698f, 9.25f)
                curveTo(12.2781f, 9.25f, 12.2863f, 9.25f, 12.2944f, 9.25f)
                curveTo(12.4305f, 9.25f, 12.5362f, 9.25f, 12.635f, 9.257f)
                curveTo(13.749f, 9.3369f, 14.7041f, 10.0826f, 15.0517f, 11.1439f)
                curveTo(15.0826f, 11.2381f, 15.1082f, 11.3407f, 15.1412f, 11.4727f)
                lineTo(15.1471f, 11.4966f)
                curveTo(15.2033f, 11.7211f, 15.22f, 11.7848f, 15.2354f, 11.8294f)
                curveTo(15.4457f, 12.4354f, 16.0806f, 12.7839f, 16.7048f, 12.6359f)
                curveTo(16.7506f, 12.6251f, 16.8134f, 12.605f, 17.0329f, 12.5318f)
                lineTo(17.7627f, 12.2885f)
                curveTo(18.1557f, 12.1575f, 18.5804f, 12.3699f, 18.7114f, 12.7628f)
                curveTo(18.8424f, 13.1558f, 18.63f, 13.5805f, 18.2371f, 13.7115f)
                lineTo(17.5072f, 13.9548f)
                curveTo(17.4963f, 13.9585f, 17.4855f, 13.9621f, 17.4748f, 13.9656f)
                curveTo(17.3028f, 14.023f, 17.1708f, 14.067f, 17.0508f, 14.0955f)
                curveTo(15.6776f, 14.4211f, 14.2808f, 13.6543f, 13.8183f, 12.321f)
                curveTo(13.7779f, 12.2045f, 13.7442f, 12.0695f, 13.7002f, 11.8936f)
                curveTo(13.6975f, 11.8827f, 13.6947f, 11.8716f, 13.6919f, 11.8604f)
                curveTo(13.6502f, 11.6934f, 13.6381f, 11.6472f, 13.6263f, 11.6109f)
                curveTo(13.4682f, 11.1285f, 13.0341f, 10.7895f, 12.5278f, 10.7532f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 4.5f)
                curveTo(14.0f, 5.8807f, 12.8807f, 7.0f, 11.5f, 7.0f)
                curveTo(10.1193f, 7.0f, 9.0f, 5.8807f, 9.0f, 4.5f)
                curveTo(9.0f, 3.1193f, 10.1193f, 2.0f, 11.5f, 2.0f)
                curveTo(12.8807f, 2.0f, 14.0f, 3.1193f, 14.0f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.4161f, 16.876f)
                curveTo(9.7607f, 17.1058f, 9.8539f, 17.5715f, 9.6241f, 17.9161f)
                lineTo(6.6241f, 22.4161f)
                curveTo(6.3944f, 22.7608f, 5.9287f, 22.8539f, 5.5841f, 22.6241f)
                curveTo(5.2394f, 22.3944f, 5.1463f, 21.9287f, 5.376f, 21.5841f)
                lineTo(8.376f, 17.0841f)
                curveTo(8.6058f, 16.7394f, 9.0715f, 16.6463f, 9.4161f, 16.876f)
                close()
            }
        }
            .build()
        return _walking!!
    }

private var _walking: ImageVector? = null
