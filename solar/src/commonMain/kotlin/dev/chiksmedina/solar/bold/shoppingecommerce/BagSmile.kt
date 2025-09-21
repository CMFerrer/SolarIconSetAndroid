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

val ShoppingEcommerceGroup.BagSmile: ImageVector
    get() {
        if (_bagSmile != null) {
            return _bagSmile!!
        }
        _bagSmile = Builder(
            name = "BagSmile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.2501f, 7.0135f)
                curveTo(8.25f, 7.009f, 8.25f, 7.0045f, 8.25f, 7.0f)
                verticalLineTo(6.0f)
                curveTo(8.25f, 3.9289f, 9.9289f, 2.25f, 12.0f, 2.25f)
                curveTo(14.0711f, 2.25f, 15.75f, 3.9289f, 15.75f, 6.0f)
                verticalLineTo(7.0f)
                curveTo(15.75f, 7.0045f, 15.75f, 7.009f, 15.7499f, 7.0135f)
                curveTo(17.0472f, 7.0497f, 17.8375f, 7.1839f, 18.4425f, 7.68f)
                curveTo(19.272f, 8.36f, 19.5029f, 9.5144f, 19.9646f, 11.8233f)
                lineTo(20.5646f, 14.8233f)
                curveTo(21.2287f, 18.1437f, 21.5608f, 19.8039f, 20.6606f, 20.902f)
                curveTo(19.7604f, 22.0f, 18.0673f, 22.0f, 14.6812f, 22.0f)
                horizontalLineTo(9.3188f)
                curveTo(5.9326f, 22.0f, 4.2395f, 22.0f, 3.3394f, 20.902f)
                curveTo(2.4392f, 19.8039f, 2.7712f, 18.1437f, 3.4353f, 14.8233f)
                lineTo(4.0353f, 11.8233f)
                curveTo(4.4971f, 9.5144f, 4.728f, 8.36f, 5.5574f, 7.68f)
                curveTo(6.1625f, 7.1839f, 6.9527f, 7.0497f, 8.2501f, 7.0135f)
                close()
                moveTo(9.75f, 6.0f)
                curveTo(9.75f, 4.7574f, 10.7574f, 3.75f, 12.0f, 3.75f)
                curveTo(13.2426f, 3.75f, 14.25f, 4.7574f, 14.25f, 6.0f)
                verticalLineTo(7.0f)
                curveTo(14.25f, 7.0f, 14.25f, 7.0f, 14.25f, 7.0f)
                curveTo(14.1944f, 7.0f, 14.1381f, 7.0f, 14.0812f, 7.0f)
                horizontalLineTo(9.9188f)
                curveTo(9.8618f, 7.0f, 9.8056f, 7.0f, 9.75f, 7.0f)
                curveTo(9.75f, 7.0f, 9.75f, 7.0f, 9.75f, 7.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(12.0004f, 17.25f)
                curveTo(11.0219f, 17.25f, 10.1874f, 16.625f, 9.8782f, 15.7501f)
                curveTo(9.7402f, 15.3595f, 9.3117f, 15.1548f, 8.9212f, 15.2929f)
                curveTo(8.5306f, 15.4309f, 8.3259f, 15.8594f, 8.464f, 16.2499f)
                curveTo(8.9784f, 17.7054f, 10.3664f, 18.75f, 12.0004f, 18.75f)
                curveTo(13.6343f, 18.75f, 15.0224f, 17.7054f, 15.5368f, 16.2499f)
                curveTo(15.6748f, 15.8594f, 15.4701f, 15.4309f, 15.0796f, 15.2929f)
                curveTo(14.6891f, 15.1548f, 14.2606f, 15.3595f, 14.1225f, 15.7501f)
                curveTo(13.8133f, 16.625f, 12.9789f, 17.25f, 12.0004f, 17.25f)
                close()
            }
        }
            .build()
        return _bagSmile!!
    }

private var _bagSmile: ImageVector? = null
