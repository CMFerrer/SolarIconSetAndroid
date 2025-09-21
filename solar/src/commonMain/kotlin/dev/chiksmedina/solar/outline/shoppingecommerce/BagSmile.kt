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
                moveTo(12.0f, 2.75f)
                curveTo(10.7574f, 2.75f, 9.75f, 3.7574f, 9.75f, 5.0f)
                verticalLineTo(5.2545f)
                curveTo(10.1675f, 5.25f, 10.6182f, 5.25f, 11.1052f, 5.25f)
                horizontalLineTo(12.8948f)
                curveTo(13.3818f, 5.25f, 13.8325f, 5.25f, 14.25f, 5.2545f)
                verticalLineTo(5.0f)
                curveTo(14.25f, 3.7574f, 13.2426f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(15.75f, 5.3069f)
                verticalLineTo(5.0f)
                curveTo(15.75f, 2.9289f, 14.0711f, 1.25f, 12.0f, 1.25f)
                curveTo(9.9289f, 1.25f, 8.25f, 2.9289f, 8.25f, 5.0f)
                verticalLineTo(5.3069f)
                curveTo(8.115f, 5.3168f, 7.9847f, 5.3283f, 7.859f, 5.3419f)
                curveTo(6.9806f, 5.4366f, 6.2461f, 5.6349f, 5.5938f, 6.082f)
                curveTo(5.3694f, 6.2357f, 5.1587f, 6.4085f, 4.9639f, 6.5983f)
                curveTo(4.3976f, 7.1503f, 4.0591f, 7.8317f, 3.794f, 8.6744f)
                curveTo(3.5366f, 9.4926f, 3.3286f, 10.5327f, 3.0672f, 11.8396f)
                lineTo(3.0482f, 11.935f)
                curveTo(2.6715f, 13.8181f, 2.3747f, 15.302f, 2.2895f, 16.484f)
                curveTo(2.2024f, 17.6916f, 2.3241f, 18.7075f, 2.8961f, 19.588f)
                curveTo(3.087f, 19.8817f, 3.3098f, 20.1534f, 3.5604f, 20.3982f)
                curveTo(4.3115f, 21.1318f, 5.2839f, 21.4504f, 6.4851f, 21.6018f)
                curveTo(7.6608f, 21.75f, 9.1741f, 21.75f, 11.0945f, 21.75f)
                horizontalLineTo(12.9055f)
                curveTo(14.8259f, 21.75f, 16.3392f, 21.75f, 17.5149f, 21.6018f)
                curveTo(18.7161f, 21.4504f, 19.6885f, 21.1318f, 20.4396f, 20.3982f)
                curveTo(20.6902f, 20.1534f, 20.913f, 19.8817f, 21.1039f, 19.588f)
                curveTo(21.6759f, 18.7075f, 21.7976f, 17.6916f, 21.7105f, 16.484f)
                curveTo(21.6253f, 15.3021f, 21.3285f, 13.8182f, 20.9519f, 11.9351f)
                lineTo(20.9328f, 11.8396f)
                curveTo(20.6714f, 10.5327f, 20.4634f, 9.4926f, 20.206f, 8.6744f)
                curveTo(19.9409f, 7.8317f, 19.6024f, 7.1503f, 19.0361f, 6.5983f)
                curveTo(18.8413f, 6.4085f, 18.6306f, 6.2357f, 18.4062f, 6.082f)
                curveTo(17.7539f, 5.6349f, 17.0194f, 5.4366f, 16.141f, 5.3419f)
                curveTo(16.0153f, 5.3283f, 15.885f, 5.3168f, 15.75f, 5.3069f)
                close()
                moveTo(8.0197f, 6.8333f)
                curveTo(7.273f, 6.9137f, 6.8117f, 7.0657f, 6.4418f, 7.3192f)
                curveTo(6.2883f, 7.4244f, 6.1441f, 7.5427f, 6.0109f, 7.6725f)
                curveTo(5.6897f, 7.9855f, 5.4502f, 8.4081f, 5.2249f, 9.1245f)
                curveTo(4.9946f, 9.8566f, 4.8014f, 10.8172f, 4.5296f, 12.1762f)
                curveTo(4.1401f, 14.1239f, 3.8632f, 15.5153f, 3.7856f, 16.5919f)
                curveTo(3.709f, 17.6538f, 3.8383f, 18.2849f, 4.154f, 18.7707f)
                curveTo(4.2845f, 18.9717f, 4.437f, 19.1576f, 4.6084f, 19.3251f)
                curveTo(5.0229f, 19.7298f, 5.6164f, 19.9804f, 6.6727f, 20.1136f)
                curveTo(7.7436f, 20.2486f, 9.1622f, 20.25f, 11.1485f, 20.25f)
                horizontalLineTo(12.8515f)
                curveTo(14.8378f, 20.25f, 16.2564f, 20.2486f, 17.3273f, 20.1136f)
                curveTo(18.3836f, 19.9804f, 18.9771f, 19.7298f, 19.3916f, 19.3251f)
                curveTo(19.563f, 19.1576f, 19.7155f, 18.9717f, 19.8461f, 18.7707f)
                curveTo(20.1617f, 18.2849f, 20.291f, 17.6538f, 20.2144f, 16.5919f)
                curveTo(20.1368f, 15.5153f, 19.8599f, 14.1239f, 19.4704f, 12.1762f)
                curveTo(19.1986f, 10.8173f, 19.0054f, 9.8566f, 18.7751f, 9.1245f)
                curveTo(18.5498f, 8.4081f, 18.3103f, 7.9855f, 17.9891f, 7.6725f)
                curveTo(17.8559f, 7.5427f, 17.7117f, 7.4244f, 17.5582f, 7.3192f)
                curveTo(17.1883f, 7.0657f, 16.727f, 6.9137f, 15.9803f, 6.8333f)
                curveTo(15.2172f, 6.751f, 14.2374f, 6.75f, 12.8515f, 6.75f)
                horizontalLineTo(11.1485f)
                curveTo(9.7626f, 6.75f, 8.7828f, 6.751f, 8.0197f, 6.8333f)
                close()
                moveTo(8.921f, 14.2929f)
                curveTo(9.3115f, 14.1548f, 9.74f, 14.3595f, 9.878f, 14.7501f)
                curveTo(10.1873f, 15.625f, 11.0217f, 16.25f, 12.0002f, 16.25f)
                curveTo(12.9787f, 16.25f, 13.8131f, 15.625f, 14.1224f, 14.7501f)
                curveTo(14.2604f, 14.3595f, 14.6889f, 14.1548f, 15.0794f, 14.2929f)
                curveTo(15.47f, 14.4309f, 15.6747f, 14.8594f, 15.5366f, 15.2499f)
                curveTo(15.0222f, 16.7054f, 13.6341f, 17.75f, 12.0002f, 17.75f)
                curveTo(10.3663f, 17.75f, 8.9782f, 16.7054f, 8.4638f, 15.2499f)
                curveTo(8.3257f, 14.8594f, 8.5304f, 14.4309f, 8.921f, 14.2929f)
                close()
            }
        }
            .build()
        return _bagSmile!!
    }

private var _bagSmile: ImageVector? = null
