package dev.chiksmedina.solar.outline.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Cart: ImageVector
    get() {
        if (_cart != null) {
            return _cart!!
        }
        _cart = Builder(
            name = "Cart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.418f, 3.2508f)
                curveTo(8.6987f, 2.6591f, 9.3016f, 2.25f, 10.0f, 2.25f)
                horizontalLineTo(14.0f)
                curveTo(14.6984f, 2.25f, 15.3012f, 2.6591f, 15.5819f, 3.2508f)
                curveTo(16.2655f, 3.2557f, 16.7982f, 3.2871f, 17.2738f, 3.473f)
                curveTo(17.842f, 3.6951f, 18.3362f, 4.0725f, 18.6999f, 4.5623f)
                curveTo(19.0668f, 5.0564f, 19.2391f, 5.6897f, 19.4761f, 6.5613f)
                curveTo(19.4883f, 6.606f, 19.5006f, 6.6514f, 19.5132f, 6.6974f)
                lineTo(20.104f, 8.8643f)
                curveTo(20.4915f, 9.0627f, 20.8306f, 9.3299f, 21.1134f, 9.6922f)
                curveTo(21.7354f, 10.4888f, 21.8456f, 11.4377f, 21.7349f, 12.5261f)
                curveTo(21.6275f, 13.5822f, 21.2951f, 14.9122f, 20.8788f, 16.577f)
                lineTo(20.8525f, 16.6824f)
                curveTo(20.5893f, 17.7352f, 20.3756f, 18.59f, 20.1214f, 19.2572f)
                curveTo(19.8565f, 19.9527f, 19.5201f, 20.5227f, 18.9654f, 20.9558f)
                curveTo(18.4108f, 21.3888f, 17.7762f, 21.5769f, 17.0372f, 21.6653f)
                curveTo(16.3284f, 21.75f, 15.4473f, 21.75f, 14.3621f, 21.75f)
                horizontalLineTo(9.6378f)
                curveTo(8.5527f, 21.75f, 7.6716f, 21.75f, 6.9628f, 21.6653f)
                curveTo(6.2238f, 21.5769f, 5.5891f, 21.3888f, 5.0345f, 20.9558f)
                curveTo(4.4799f, 20.5227f, 4.1435f, 19.9527f, 3.8785f, 19.2572f)
                curveTo(3.6244f, 18.5901f, 3.4107f, 17.7353f, 3.1475f, 16.6825f)
                lineTo(3.1211f, 16.5769f)
                curveTo(2.7049f, 14.9121f, 2.3724f, 13.5822f, 2.265f, 12.5261f)
                curveTo(2.1544f, 11.4377f, 2.2645f, 10.4888f, 2.8865f, 9.6922f)
                curveTo(3.1694f, 9.3299f, 3.5085f, 9.0627f, 3.8959f, 8.8643f)
                lineTo(4.4868f, 6.6974f)
                curveTo(4.4993f, 6.6514f, 4.5117f, 6.606f, 4.5238f, 6.5613f)
                curveTo(4.7609f, 5.6897f, 4.9331f, 5.0564f, 5.3001f, 4.5623f)
                curveTo(5.6638f, 4.0725f, 6.158f, 3.6951f, 6.7262f, 3.473f)
                curveTo(7.2017f, 3.2871f, 7.7345f, 3.2557f, 8.418f, 3.2508f)
                close()
                moveTo(8.4194f, 4.7522f)
                curveTo(7.7576f, 4.7589f, 7.492f, 4.7842f, 7.2722f, 4.8701f)
                curveTo(6.9663f, 4.9896f, 6.7002f, 5.1929f, 6.5043f, 5.4566f)
                curveTo(6.3282f, 5.6938f, 6.2249f, 6.0251f, 5.934f, 7.0919f)
                lineTo(5.5804f, 8.3887f)
                curveTo(6.6182f, 8.25f, 7.958f, 8.25f, 9.6226f, 8.25f)
                horizontalLineTo(14.3774f)
                curveTo(16.042f, 8.25f, 17.3818f, 8.25f, 18.4196f, 8.3887f)
                lineTo(18.066f, 7.0919f)
                curveTo(17.7751f, 6.0251f, 17.6718f, 5.6938f, 17.4957f, 5.4566f)
                curveTo(17.2998f, 5.1929f, 17.0337f, 4.9896f, 16.7277f, 4.8701f)
                curveTo(16.5079f, 4.7842f, 16.2424f, 4.7589f, 15.5805f, 4.7522f)
                curveTo(15.2992f, 5.3422f, 14.6972f, 5.75f, 14.0f, 5.75f)
                horizontalLineTo(10.0f)
                curveTo(9.3027f, 5.75f, 8.7007f, 5.3422f, 8.4194f, 4.7522f)
                close()
                moveTo(10.0f, 3.75f)
                curveTo(9.8619f, 3.75f, 9.75f, 3.8619f, 9.75f, 4.0f)
                curveTo(9.75f, 4.1381f, 9.8619f, 4.25f, 10.0f, 4.25f)
                horizontalLineTo(14.0f)
                curveTo(14.1381f, 4.25f, 14.25f, 4.1381f, 14.25f, 4.0f)
                curveTo(14.25f, 3.8619f, 14.1381f, 3.75f, 14.0f, 3.75f)
                horizontalLineTo(10.0f)
                close()
                moveTo(5.6998f, 9.8865f)
                curveTo(4.7887f, 10.0183f, 4.3477f, 10.2582f, 4.0689f, 10.6153f)
                curveTo(3.79f, 10.9725f, 3.6642f, 11.4584f, 3.7573f, 12.3744f)
                curveTo(3.8525f, 13.3099f, 4.1567f, 14.5345f, 4.5914f, 16.2733f)
                curveTo(4.8687f, 17.3824f, 5.0617f, 18.1496f, 5.2803f, 18.7231f)
                curveTo(5.4916f, 19.2778f, 5.6985f, 19.5711f, 5.9576f, 19.7735f)
                curveTo(6.2168f, 19.9758f, 6.5515f, 20.1054f, 7.1409f, 20.1759f)
                curveTo(7.7503f, 20.2488f, 8.5414f, 20.25f, 9.6846f, 20.25f)
                horizontalLineTo(14.3153f)
                curveTo(15.4585f, 20.25f, 16.2497f, 20.2488f, 16.8591f, 20.1759f)
                curveTo(17.4484f, 20.1054f, 17.7832f, 19.9758f, 18.0423f, 19.7735f)
                curveTo(18.3015f, 19.5711f, 18.5084f, 19.2778f, 18.7197f, 18.7231f)
                curveTo(18.9382f, 18.1496f, 19.1313f, 17.3824f, 19.4086f, 16.2733f)
                curveTo(19.8433f, 14.5345f, 20.1475f, 13.3099f, 20.2426f, 12.3744f)
                curveTo(20.3357f, 11.4584f, 20.21f, 10.9725f, 19.9311f, 10.6153f)
                curveTo(19.6523f, 10.2582f, 19.2113f, 10.0183f, 18.3001f, 9.8865f)
                curveTo(17.3695f, 9.7519f, 16.1077f, 9.75f, 14.3153f, 9.75f)
                horizontalLineTo(9.6846f)
                curveTo(7.8923f, 9.75f, 6.6305f, 9.7519f, 5.6998f, 9.8865f)
                close()
            }
        }
            .build()
        return _cart!!
    }

private var _cart: ImageVector? = null
