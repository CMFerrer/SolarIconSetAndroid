package dev.chiksmedina.solar.bold.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ShoppingEcommerceGroup

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
                moveTo(8.418f, 3.2509f)
                curveTo(8.6987f, 2.6592f, 9.3015f, 2.25f, 10.0f, 2.25f)
                horizontalLineTo(14.0f)
                curveTo(14.6984f, 2.25f, 15.3013f, 2.6592f, 15.582f, 3.2509f)
                curveTo(16.2655f, 3.2559f, 16.7983f, 3.2872f, 17.2738f, 3.4731f)
                curveTo(17.842f, 3.6952f, 18.3362f, 4.0727f, 18.6999f, 4.5624f)
                curveTo(19.0668f, 5.0565f, 19.2391f, 5.6898f, 19.4762f, 6.5614f)
                lineTo(20.2181f, 9.2827f)
                lineTo(20.4985f, 10.124f)
                curveTo(20.5065f, 10.1339f, 20.5144f, 10.1438f, 20.5222f, 10.1539f)
                curveTo(21.4231f, 11.3076f, 20.9941f, 13.0235f, 20.1362f, 16.4553f)
                curveTo(19.5905f, 18.638f, 19.3176f, 19.7293f, 18.5039f, 20.3647f)
                curveTo(17.6901f, 21.0001f, 16.5652f, 21.0001f, 14.3153f, 21.0001f)
                horizontalLineTo(9.6846f)
                curveTo(7.4348f, 21.0001f, 6.3098f, 21.0001f, 5.496f, 20.3647f)
                curveTo(4.6823f, 19.7293f, 4.4094f, 18.638f, 3.8638f, 16.4553f)
                curveTo(3.0058f, 13.0235f, 2.5768f, 11.3076f, 3.4777f, 10.1539f)
                curveTo(3.4855f, 10.1438f, 3.4935f, 10.1338f, 3.5015f, 10.1239f)
                lineTo(3.7819f, 9.2827f)
                lineTo(4.5238f, 6.5615f)
                curveTo(4.7609f, 5.6898f, 4.9332f, 5.0565f, 5.3001f, 4.5624f)
                curveTo(5.6638f, 4.0727f, 6.158f, 3.6952f, 6.7262f, 3.4731f)
                curveTo(7.2017f, 3.2872f, 7.7345f, 3.2559f, 8.418f, 3.2509f)
                close()
                moveTo(8.4195f, 4.7523f)
                curveTo(7.7576f, 4.759f, 7.492f, 4.7843f, 7.2722f, 4.8702f)
                curveTo(6.9663f, 4.9898f, 6.7002f, 5.193f, 6.5043f, 5.4567f)
                curveTo(6.3282f, 5.6939f, 6.2249f, 6.0252f, 5.934f, 7.0921f)
                lineTo(5.3644f, 9.1809f)
                curveTo(6.3845f, 9.0001f, 7.7775f, 9.0001f, 9.6846f, 9.0001f)
                horizontalLineTo(14.3153f)
                curveTo(16.2224f, 9.0001f, 17.6155f, 9.0001f, 18.6356f, 9.1809f)
                lineTo(18.066f, 7.0921f)
                curveTo(17.7751f, 6.0252f, 17.6718f, 5.6939f, 17.4957f, 5.4567f)
                curveTo(17.2998f, 5.193f, 17.0337f, 4.9898f, 16.7278f, 4.8702f)
                curveTo(16.508f, 4.7843f, 16.2424f, 4.759f, 15.5805f, 4.7523f)
                curveTo(15.2992f, 5.3423f, 14.6972f, 5.75f, 14.0f, 5.75f)
                horizontalLineTo(10.0f)
                curveTo(9.3028f, 5.75f, 8.7008f, 5.3423f, 8.4195f, 4.7523f)
                close()
            }
        }
            .build()
        return _cart!!
    }

private var _cart: ImageVector? = null
