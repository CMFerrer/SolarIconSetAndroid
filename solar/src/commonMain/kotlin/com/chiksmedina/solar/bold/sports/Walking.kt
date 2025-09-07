package com.chiksmedina.solar.bold.sports

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
import com.chiksmedina.solar.bold.SportsGroup

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
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 4.5f)
                curveTo(14.0f, 5.8807f, 12.8808f, 7.0f, 11.5f, 7.0f)
                curveTo(10.1193f, 7.0f, 9.0f, 5.8807f, 9.0f, 4.5f)
                curveTo(9.0f, 3.1193f, 10.1193f, 2.0f, 11.5f, 2.0f)
                curveTo(12.8808f, 2.0f, 14.0f, 3.1193f, 14.0f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.5279f, 10.7532f)
                curveTo(12.4898f, 10.7505f, 12.4421f, 10.75f, 12.2699f, 10.75f)
                horizontalLineTo(11.1788f)
                lineTo(11.0876f, 11.6615f)
                curveTo(10.9136f, 13.4019f, 10.8531f, 14.1013f, 11.0085f, 14.7631f)
                curveTo(11.164f, 15.4248f, 11.5297f, 16.024f, 12.4605f, 17.5048f)
                lineTo(15.0354f, 21.6008f)
                curveTo(15.2558f, 21.9515f, 15.1503f, 22.4145f, 14.7996f, 22.635f)
                curveTo(14.4489f, 22.8554f, 13.9859f, 22.7498f, 13.7655f, 22.3992f)
                lineTo(11.1906f, 18.3031f)
                curveTo(11.1661f, 18.2642f, 11.1419f, 18.2256f, 11.1179f, 18.1875f)
                curveTo(10.283f, 16.8599f, 9.7679f, 16.0407f, 9.5483f, 15.1061f)
                curveTo(9.3287f, 14.1715f, 9.4252f, 13.2086f, 9.5815f, 11.6482f)
                curveTo(9.5859f, 11.6034f, 9.5905f, 11.5581f, 9.5951f, 11.5123f)
                lineTo(9.6712f, 10.7509f)
                curveTo(9.17f, 10.7535f, 8.7993f, 10.7632f, 8.5f, 10.7995f)
                curveTo(8.1228f, 10.8453f, 7.9468f, 10.925f, 7.8222f, 11.0249f)
                curveTo(7.6976f, 11.1249f, 7.5817f, 11.2794f, 7.4551f, 11.6377f)
                curveTo(7.3218f, 12.0153f, 7.207f, 12.526f, 7.0361f, 13.295f)
                lineTo(6.7322f, 14.6627f)
                curveTo(6.6423f, 15.067f, 6.2417f, 15.322f, 5.8373f, 15.2321f)
                curveTo(5.433f, 15.1423f, 5.178f, 14.7417f, 5.2679f, 14.3373f)
                lineTo(5.5816f, 12.9256f)
                curveTo(5.7401f, 12.2123f, 5.8735f, 11.6118f, 6.0407f, 11.1382f)
                curveTo(6.2182f, 10.6357f, 6.4598f, 10.1948f, 6.8836f, 9.8549f)
                curveTo(7.3074f, 9.5149f, 7.7903f, 9.3747f, 8.3193f, 9.3104f)
                curveTo(8.8178f, 9.25f, 9.433f, 9.25f, 10.1637f, 9.25f)
                lineTo(12.2699f, 9.25f)
                curveTo(12.2782f, 9.25f, 12.2864f, 9.25f, 12.2945f, 9.25f)
                curveTo(12.4306f, 9.25f, 12.5363f, 9.25f, 12.6352f, 9.257f)
                curveTo(13.7491f, 9.3369f, 14.7042f, 10.0826f, 15.0518f, 11.1439f)
                curveTo(15.0827f, 11.2381f, 15.1083f, 11.3407f, 15.1413f, 11.4727f)
                lineTo(15.1473f, 11.4966f)
                curveTo(15.2034f, 11.7211f, 15.2201f, 11.7848f, 15.2356f, 11.8293f)
                curveTo(15.4458f, 12.4354f, 16.0807f, 12.7839f, 16.7049f, 12.6359f)
                curveTo(16.7507f, 12.6251f, 16.8135f, 12.6049f, 17.033f, 12.5318f)
                lineTo(17.7629f, 12.2885f)
                curveTo(18.1558f, 12.1575f, 18.5806f, 12.3699f, 18.7116f, 12.7628f)
                curveTo(18.8425f, 13.1558f, 18.6302f, 13.5805f, 18.2372f, 13.7115f)
                lineTo(17.5074f, 13.9548f)
                curveTo(17.4964f, 13.9584f, 17.4856f, 13.9621f, 17.4749f, 13.9656f)
                curveTo(17.3029f, 14.023f, 17.1709f, 14.067f, 17.051f, 14.0955f)
                curveTo(15.6777f, 14.4211f, 14.281f, 13.6543f, 13.8184f, 12.321f)
                curveTo(13.778f, 12.2045f, 13.7443f, 12.0695f, 13.7003f, 11.8936f)
                curveTo(13.6976f, 11.8827f, 13.6949f, 11.8716f, 13.6921f, 11.8604f)
                curveTo(13.6503f, 11.6934f, 13.6383f, 11.6472f, 13.6264f, 11.6109f)
                curveTo(13.4683f, 11.1285f, 13.0342f, 10.7895f, 12.5279f, 10.7532f)
                close()
                moveTo(9.4161f, 16.876f)
                curveTo(9.7607f, 17.1057f, 9.8538f, 17.5714f, 9.6241f, 17.916f)
                lineTo(6.6241f, 22.416f)
                curveTo(6.3943f, 22.7607f, 5.9287f, 22.8538f, 5.584f, 22.624f)
                curveTo(5.2394f, 22.3943f, 5.1462f, 21.9286f, 5.376f, 21.584f)
                lineTo(8.376f, 17.084f)
                curveTo(8.6058f, 16.7393f, 9.0714f, 16.6462f, 9.4161f, 16.876f)
                close()
            }
        }
            .build()
        return _walking!!
    }

private var _walking: ImageVector? = null
