package com.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FoodKitchenGroup

val FoodKitchenGroup.Bottle: ImageVector
    get() {
        if (_bottle != null) {
            return _bottle!!
        }
        _bottle = Builder(
            name = "Bottle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.9925f, 2.0166f)
                curveTo(15.927f, 2.1148f, 15.861f, 2.2341f, 15.7998f, 2.3448f)
                lineTo(15.4773f, 2.9277f)
                lineTo(12.6497f, 4.3174f)
                curveTo(12.5735f, 4.3548f, 12.5266f, 4.3778f, 12.4819f, 4.4008f)
                curveTo(10.856f, 5.2357f, 9.7105f, 6.8045f, 9.3656f, 8.6338f)
                curveTo(9.3561f, 8.6842f, 9.3471f, 8.7368f, 9.3322f, 8.8238f)
                lineTo(9.3309f, 8.831f)
                curveTo(9.315f, 8.9239f, 9.308f, 8.9648f, 9.3008f, 9.0043f)
                curveTo(9.0346f, 10.4599f, 8.3439f, 11.7884f, 7.3284f, 12.8102f)
                curveTo(7.3008f, 12.8379f, 7.2721f, 12.8662f, 7.2062f, 12.9309f)
                lineTo(6.4018f, 13.7219f)
                curveTo(5.8978f, 14.2174f, 5.4915f, 14.617f, 5.1877f, 14.9606f)
                curveTo(4.8776f, 15.3115f, 4.6276f, 15.6545f, 4.4773f, 16.049f)
                curveTo(4.0762f, 17.1023f, 4.2112f, 18.2961f, 4.8407f, 19.2292f)
                curveTo(5.0768f, 19.5791f, 5.3987f, 19.8547f, 5.7799f, 20.1229f)
                curveTo(6.1531f, 20.3854f, 6.6386f, 20.6779f, 7.2401f, 21.0402f)
                lineTo(7.9531f, 21.4697f)
                curveTo(8.5544f, 21.8319f, 9.04f, 22.1244f, 9.4448f, 22.3306f)
                curveTo(9.8568f, 22.5404f, 10.2515f, 22.6965f, 10.6702f, 22.7359f)
                curveTo(11.7877f, 22.8408f, 12.8691f, 22.3508f, 13.5501f, 21.452f)
                curveTo(13.8038f, 21.1172f, 13.9627f, 20.7204f, 14.0978f, 20.2682f)
                curveTo(14.2308f, 19.8231f, 14.359f, 19.2574f, 14.5185f, 18.5532f)
                lineTo(14.7726f, 17.432f)
                curveTo(14.7934f, 17.3402f, 14.8025f, 17.2998f, 14.8118f, 17.2608f)
                curveTo(15.1543f, 15.8233f, 15.9137f, 14.5374f, 16.9809f, 13.5762f)
                curveTo(17.0098f, 13.5501f, 17.04f, 13.5235f, 17.1092f, 13.4626f)
                lineTo(17.1147f, 13.4578f)
                curveTo(17.1793f, 13.401f, 17.2187f, 13.3662f, 17.2562f, 13.3321f)
                curveTo(18.614f, 12.095f, 19.3318f, 10.2778f, 19.2136f, 8.4183f)
                curveTo(19.2103f, 8.3671f, 19.206f, 8.3138f, 19.199f, 8.2258f)
                lineTo(18.9373f, 4.9587f)
                lineTo(19.2924f, 4.3169f)
                curveTo(19.3496f, 4.2136f, 19.4119f, 4.1011f, 19.4581f, 3.9991f)
                curveTo(19.5106f, 3.8832f, 19.5692f, 3.7252f, 19.5779f, 3.5324f)
                curveTo(19.5895f, 3.275f, 19.5213f, 3.0202f, 19.3826f, 2.8031f)
                curveTo(19.2787f, 2.6404f, 19.149f, 2.5328f, 19.0456f, 2.4587f)
                curveTo(18.9547f, 2.3934f, 18.8445f, 2.327f, 18.7434f, 2.2661f)
                lineTo(17.928f, 1.775f)
                curveTo(17.8197f, 1.7097f, 17.7029f, 1.6393f, 17.5971f, 1.5869f)
                curveTo(17.4778f, 1.5279f, 17.3127f, 1.4603f, 17.109f, 1.448f)
                curveTo(16.8392f, 1.4319f, 16.5715f, 1.5036f, 16.3459f, 1.6524f)
                curveTo(16.1756f, 1.7647f, 16.0663f, 1.9058f, 15.9925f, 2.0166f)
                close()
                moveTo(15.983f, 4.3505f)
                lineTo(17.4548f, 5.2371f)
                lineTo(17.7032f, 8.3382f)
                curveTo(17.7083f, 8.4021f, 17.7115f, 8.4414f, 17.7137f, 8.4715f)
                lineTo(16.6585f, 8.8232f)
                curveTo(16.0296f, 9.0329f, 15.3373f, 8.9094f, 14.8196f, 8.4953f)
                curveTo(13.7675f, 7.6536f, 12.322f, 7.5004f, 11.1169f, 8.103f)
                lineTo(11.0572f, 8.1328f)
                curveTo(11.4489f, 7.0893f, 12.1998f, 6.2319f, 13.1671f, 5.7352f)
                curveTo(13.1987f, 5.7189f, 13.2331f, 5.702f, 13.3182f, 5.6602f)
                lineTo(15.983f, 4.3505f)
                close()
            }
        }
            .build()
        return _bottle!!
    }

private var _bottle: ImageVector? = null
