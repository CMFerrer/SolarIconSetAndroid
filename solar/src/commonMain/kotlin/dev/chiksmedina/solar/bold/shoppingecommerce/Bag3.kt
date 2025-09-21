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

val ShoppingEcommerceGroup.Bag3: ImageVector
    get() {
        if (_bag3 != null) {
            return _bag3!!
        }
        _bag3 = Builder(
            name = "Bag3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.5739f, 4.6915f)
                curveTo(4.7407f, 5.3829f, 4.5212f, 6.5534f, 4.0823f, 8.8943f)
                lineTo(3.3323f, 12.8943f)
                curveTo(2.7151f, 16.186f, 2.4065f, 17.8318f, 3.3062f, 18.9159f)
                curveTo(4.2059f, 20.0f, 5.8805f, 20.0f, 9.2295f, 20.0f)
                horizontalLineTo(14.7704f)
                curveTo(18.1195f, 20.0f, 19.794f, 20.0f, 20.6937f, 18.9159f)
                curveTo(21.5934f, 17.8318f, 21.2849f, 16.186f, 20.6677f, 12.8943f)
                lineTo(19.9177f, 8.8943f)
                curveTo(19.4787f, 6.5534f, 19.2593f, 5.3829f, 18.4261f, 4.6915f)
                curveTo(17.5929f, 4.0f, 16.4021f, 4.0f, 14.0204f, 4.0f)
                horizontalLineTo(9.9795f)
                curveTo(7.5979f, 4.0f, 6.407f, 4.0f, 5.5739f, 4.6915f)
                close()
                moveTo(9.8782f, 7.7501f)
                curveTo(10.1875f, 8.625f, 11.0219f, 9.25f, 12.0004f, 9.25f)
                curveTo(12.9789f, 9.25f, 13.8133f, 8.625f, 14.1225f, 7.7501f)
                curveTo(14.2606f, 7.3595f, 14.6891f, 7.1548f, 15.0796f, 7.2929f)
                curveTo(15.4701f, 7.4309f, 15.6748f, 7.8594f, 15.5368f, 8.2499f)
                curveTo(15.0224f, 9.7054f, 13.6343f, 10.75f, 12.0004f, 10.75f)
                curveTo(10.3664f, 10.75f, 8.9784f, 9.7054f, 8.464f, 8.2499f)
                curveTo(8.3259f, 7.8594f, 8.5306f, 7.4309f, 8.9212f, 7.2929f)
                curveTo(9.3117f, 7.1548f, 9.7402f, 7.3595f, 9.8782f, 7.7501f)
                close()
            }
        }
            .build()
        return _bag3!!
    }

private var _bag3: ImageVector? = null
