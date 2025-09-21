package dev.chiksmedina.solar.outline.shoppingecommerce

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
import dev.chiksmedina.solar.outline.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Cart3: ImageVector
    get() {
        if (_cart3 != null) {
            return _cart3!!
        }
        _cart3 = Builder(
            name = "Cart3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.75f, 13.0f)
                curveTo(8.75f, 12.5858f, 8.4142f, 12.25f, 8.0f, 12.25f)
                curveTo(7.5858f, 12.25f, 7.25f, 12.5858f, 7.25f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(7.25f, 17.4142f, 7.5858f, 17.75f, 8.0f, 17.75f)
                curveTo(8.4142f, 17.75f, 8.75f, 17.4142f, 8.75f, 17.0f)
                verticalLineTo(13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 12.25f)
                curveTo(16.4142f, 12.25f, 16.75f, 12.5858f, 16.75f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(16.75f, 17.4142f, 16.4142f, 17.75f, 16.0f, 17.75f)
                curveTo(15.5858f, 17.75f, 15.25f, 17.4142f, 15.25f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(15.25f, 12.5858f, 15.5858f, 12.25f, 16.0f, 12.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 13.0f)
                curveTo(12.75f, 12.5858f, 12.4142f, 12.25f, 12.0f, 12.25f)
                curveTo(11.5858f, 12.25f, 11.25f, 12.5858f, 11.25f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(11.25f, 17.4142f, 11.5858f, 17.75f, 12.0f, 17.75f)
                curveTo(12.4142f, 17.75f, 12.75f, 17.4142f, 12.75f, 17.0f)
                verticalLineTo(13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.2738f, 3.473f)
                curveTo(16.7983f, 3.2871f, 16.2655f, 3.2557f, 15.582f, 3.2508f)
                curveTo(15.3013f, 2.6591f, 14.6984f, 2.25f, 14.0f, 2.25f)
                horizontalLineTo(10.0f)
                curveTo(9.3016f, 2.25f, 8.6988f, 2.6591f, 8.4181f, 3.2508f)
                curveTo(7.7345f, 3.2557f, 7.2018f, 3.2871f, 6.7262f, 3.473f)
                curveTo(6.1581f, 3.6951f, 5.6638f, 4.0725f, 5.3001f, 4.5623f)
                curveTo(4.9332f, 5.0564f, 4.7609f, 5.6897f, 4.5239f, 6.5613f)
                lineTo(3.896f, 8.8643f)
                curveTo(3.5085f, 9.0627f, 3.1694f, 9.3299f, 2.8865f, 9.6922f)
                curveTo(2.2645f, 10.4888f, 2.1544f, 11.4377f, 2.265f, 12.5261f)
                curveTo(2.3724f, 13.5822f, 2.7049f, 14.9121f, 3.1211f, 16.5769f)
                lineTo(3.1475f, 16.6825f)
                curveTo(3.4107f, 17.7353f, 3.6244f, 18.5901f, 3.8785f, 19.2572f)
                curveTo(4.1435f, 19.9527f, 4.4799f, 20.5227f, 5.0345f, 20.9558f)
                curveTo(5.5891f, 21.3888f, 6.2238f, 21.5769f, 6.9628f, 21.6653f)
                curveTo(7.6716f, 21.75f, 8.5527f, 21.75f, 9.6379f, 21.75f)
                horizontalLineTo(14.3621f)
                curveTo(15.4473f, 21.75f, 16.3284f, 21.75f, 17.0372f, 21.6653f)
                curveTo(17.7762f, 21.5769f, 18.4108f, 21.3888f, 18.9654f, 20.9558f)
                curveTo(19.5201f, 20.5227f, 19.8565f, 19.9527f, 20.1214f, 19.2572f)
                curveTo(20.3756f, 18.5901f, 20.5893f, 17.7353f, 20.8524f, 16.6825f)
                lineTo(20.8788f, 16.577f)
                curveTo(21.295f, 14.9122f, 21.6276f, 13.5822f, 21.7349f, 12.5261f)
                curveTo(21.8456f, 11.4377f, 21.7354f, 10.4888f, 21.1134f, 9.6922f)
                curveTo(20.8306f, 9.33f, 20.4915f, 9.0627f, 20.1041f, 8.8643f)
                lineTo(19.4762f, 6.5613f)
                curveTo(19.2391f, 5.6897f, 19.0669f, 5.0564f, 18.6999f, 4.5623f)
                curveTo(18.3362f, 4.0725f, 17.842f, 3.6951f, 17.2738f, 3.473f)
                close()
                moveTo(7.2723f, 4.8701f)
                curveTo(7.4921f, 4.7842f, 7.7576f, 4.7589f, 8.4195f, 4.7522f)
                curveTo(8.7008f, 5.3422f, 9.3028f, 5.75f, 10.0f, 5.75f)
                horizontalLineTo(14.0f)
                curveTo(14.6973f, 5.75f, 15.2993f, 5.3422f, 15.5806f, 4.7522f)
                curveTo(16.2424f, 4.7589f, 16.508f, 4.7842f, 16.7278f, 4.8701f)
                curveTo(17.0337f, 4.9896f, 17.2998f, 5.1929f, 17.4957f, 5.4566f)
                curveTo(17.6718f, 5.6938f, 17.7751f, 6.0251f, 18.066f, 7.0919f)
                lineTo(18.4196f, 8.3887f)
                curveTo(17.3818f, 8.25f, 16.042f, 8.25f, 14.3774f, 8.25f)
                horizontalLineTo(9.6226f)
                curveTo(7.958f, 8.25f, 6.6182f, 8.25f, 5.5804f, 8.3887f)
                lineTo(5.934f, 7.0919f)
                curveTo(6.2249f, 6.0251f, 6.3282f, 5.6938f, 6.5044f, 5.4566f)
                curveTo(6.7002f, 5.1929f, 6.9663f, 4.9896f, 7.2723f, 4.8701f)
                close()
                moveTo(10.0f, 3.75f)
                curveTo(9.8619f, 3.75f, 9.75f, 3.8619f, 9.75f, 4.0f)
                curveTo(9.75f, 4.1381f, 9.8619f, 4.25f, 10.0f, 4.25f)
                horizontalLineTo(14.0f)
                curveTo(14.1381f, 4.25f, 14.25f, 4.1381f, 14.25f, 4.0f)
                curveTo(14.25f, 3.8619f, 14.1381f, 3.75f, 14.0f, 3.75f)
                horizontalLineTo(10.0f)
                close()
                moveTo(4.0689f, 10.6153f)
                curveTo(4.3477f, 10.2582f, 4.7887f, 10.0183f, 5.6998f, 9.8865f)
                curveTo(6.6305f, 9.7519f, 7.8923f, 9.75f, 9.6846f, 9.75f)
                horizontalLineTo(14.3153f)
                curveTo(16.1077f, 9.75f, 17.3695f, 9.7519f, 18.3001f, 9.8865f)
                curveTo(19.2113f, 10.0183f, 19.6523f, 10.2582f, 19.9311f, 10.6153f)
                curveTo(20.21f, 10.9725f, 20.3357f, 11.4584f, 20.2426f, 12.3744f)
                curveTo(20.1475f, 13.3099f, 19.8433f, 14.5345f, 19.4086f, 16.2733f)
                curveTo(19.1313f, 17.3824f, 18.9382f, 18.1496f, 18.7197f, 18.7231f)
                curveTo(18.5084f, 19.2778f, 18.3015f, 19.5711f, 18.0423f, 19.7735f)
                curveTo(17.7832f, 19.9758f, 17.4484f, 20.1054f, 16.8591f, 20.1759f)
                curveTo(16.2497f, 20.2488f, 15.4585f, 20.25f, 14.3153f, 20.25f)
                horizontalLineTo(9.6846f)
                curveTo(8.5414f, 20.25f, 7.7503f, 20.2488f, 7.1409f, 20.1759f)
                curveTo(6.5515f, 20.1054f, 6.2168f, 19.9758f, 5.9576f, 19.7735f)
                curveTo(5.6985f, 19.5711f, 5.4916f, 19.2778f, 5.2803f, 18.7231f)
                curveTo(5.0617f, 18.1496f, 4.8687f, 17.3824f, 4.5914f, 16.2733f)
                curveTo(4.1567f, 14.5345f, 3.8525f, 13.3099f, 3.7573f, 12.3744f)
                curveTo(3.6642f, 11.4584f, 3.79f, 10.9725f, 4.0689f, 10.6153f)
                close()
            }
        }
            .build()
        return _cart3!!
    }

private var _cart3: ImageVector? = null
