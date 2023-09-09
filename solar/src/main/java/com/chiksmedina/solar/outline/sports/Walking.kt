package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

public val SportsGroup.Walking: ImageVector
    get() {
        if (_walking != null) {
            return _walking!!
        }
        _walking = Builder(name = "Walking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 2.75f)
                curveTo(11.5335f, 2.75f, 10.75f, 3.5335f, 10.75f, 4.5f)
                curveTo(10.75f, 5.4665f, 11.5335f, 6.25f, 12.5f, 6.25f)
                curveTo(13.4665f, 6.25f, 14.25f, 5.4665f, 14.25f, 4.5f)
                curveTo(14.25f, 3.5335f, 13.4665f, 2.75f, 12.5f, 2.75f)
                close()
                moveTo(9.25f, 4.5f)
                curveTo(9.25f, 2.7051f, 10.7051f, 1.25f, 12.5f, 1.25f)
                curveTo(14.2949f, 1.25f, 15.75f, 2.7051f, 15.75f, 4.5f)
                curveTo(15.75f, 6.2949f, 14.2949f, 7.75f, 12.5f, 7.75f)
                curveTo(10.7051f, 7.75f, 9.25f, 6.2949f, 9.25f, 4.5f)
                close()
                moveTo(13.5278f, 10.7532f)
                curveTo(13.4897f, 10.7505f, 13.442f, 10.75f, 13.2698f, 10.75f)
                horizontalLineTo(12.1787f)
                lineTo(12.0876f, 11.6615f)
                curveTo(11.9135f, 13.4019f, 11.853f, 14.1013f, 12.0085f, 14.7631f)
                curveTo(12.164f, 15.4248f, 12.5296f, 16.024f, 13.4605f, 17.5048f)
                lineTo(16.0353f, 21.6008f)
                curveTo(16.2558f, 21.9515f, 16.1502f, 22.4145f, 15.7995f, 22.635f)
                curveTo(15.4488f, 22.8554f, 14.9859f, 22.7498f, 14.7654f, 22.3992f)
                lineTo(12.1905f, 18.3031f)
                curveTo(12.166f, 18.2642f, 12.1418f, 18.2256f, 12.1178f, 18.1875f)
                curveTo(11.283f, 16.8599f, 10.7678f, 16.0407f, 10.5482f, 15.1061f)
                curveTo(10.3287f, 14.1715f, 10.4251f, 13.2086f, 10.5814f, 11.6482f)
                curveTo(10.5859f, 11.6034f, 10.5904f, 11.5581f, 10.595f, 11.5123f)
                lineTo(10.6711f, 10.7509f)
                curveTo(10.17f, 10.7535f, 9.7992f, 10.7632f, 9.4999f, 10.7995f)
                curveTo(9.1227f, 10.8453f, 8.9468f, 10.925f, 8.8222f, 11.0249f)
                curveTo(8.6975f, 11.1249f, 8.5816f, 11.2794f, 8.4551f, 11.6377f)
                curveTo(8.3218f, 12.0153f, 8.2069f, 12.526f, 8.0361f, 13.295f)
                lineTo(7.7321f, 14.6627f)
                curveTo(7.6423f, 15.067f, 7.2416f, 15.322f, 6.8373f, 15.2321f)
                curveTo(6.4329f, 15.1423f, 6.178f, 14.7417f, 6.2678f, 14.3373f)
                lineTo(6.5815f, 12.9256f)
                curveTo(6.74f, 12.2123f, 6.8735f, 11.6118f, 7.0407f, 11.1382f)
                curveTo(7.2181f, 10.6357f, 7.4598f, 10.1948f, 7.8836f, 9.8549f)
                curveTo(8.3074f, 9.5149f, 8.7902f, 9.3747f, 9.3192f, 9.3104f)
                curveTo(9.8177f, 9.25f, 10.4329f, 9.25f, 11.1637f, 9.25f)
                lineTo(13.2698f, 9.25f)
                curveTo(13.2781f, 9.25f, 13.2864f, 9.25f, 13.2945f, 9.25f)
                curveTo(13.4305f, 9.25f, 13.5362f, 9.25f, 13.6351f, 9.257f)
                curveTo(14.7491f, 9.3369f, 15.7041f, 10.0826f, 16.0518f, 11.1439f)
                curveTo(16.0826f, 11.2381f, 16.1083f, 11.3407f, 16.1412f, 11.4726f)
                lineTo(16.1472f, 11.4966f)
                curveTo(16.2033f, 11.7211f, 16.22f, 11.7848f, 16.2355f, 11.8293f)
                curveTo(16.4457f, 12.4354f, 17.0806f, 12.7839f, 17.7048f, 12.6359f)
                curveTo(17.7507f, 12.6251f, 17.8134f, 12.6049f, 18.033f, 12.5318f)
                lineTo(18.7628f, 12.2885f)
                curveTo(19.1558f, 12.1575f, 19.5805f, 12.3699f, 19.7115f, 12.7628f)
                curveTo(19.8425f, 13.1558f, 19.6301f, 13.5805f, 19.2371f, 13.7115f)
                lineTo(18.5073f, 13.9548f)
                curveTo(18.4963f, 13.9584f, 18.4855f, 13.9621f, 18.4749f, 13.9656f)
                curveTo(18.3029f, 14.023f, 18.1708f, 14.067f, 18.0509f, 14.0955f)
                curveTo(16.6777f, 14.4211f, 15.2809f, 13.6543f, 14.8183f, 12.321f)
                curveTo(14.7779f, 12.2045f, 14.7442f, 12.0695f, 14.7003f, 11.8935f)
                curveTo(14.6976f, 11.8827f, 14.6948f, 11.8716f, 14.692f, 11.8604f)
                curveTo(14.6502f, 11.6934f, 14.6382f, 11.6472f, 14.6263f, 11.6109f)
                curveTo(14.4683f, 11.1285f, 14.0342f, 10.7895f, 13.5278f, 10.7532f)
                close()
                moveTo(10.416f, 16.876f)
                curveTo(10.7606f, 17.1057f, 10.8538f, 17.5714f, 10.624f, 17.916f)
                lineTo(7.624f, 22.416f)
                curveTo(7.3942f, 22.7607f, 6.9286f, 22.8538f, 6.584f, 22.624f)
                curveTo(6.2393f, 22.3943f, 6.1462f, 21.9286f, 6.3759f, 21.584f)
                lineTo(9.3759f, 17.084f)
                curveTo(9.6057f, 16.7393f, 10.0714f, 16.6462f, 10.416f, 16.876f)
                close()
            }
        }
        .build()
        return _walking!!
    }

private var _walking: ImageVector? = null
