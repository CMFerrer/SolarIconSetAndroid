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

val ShoppingEcommerceGroup.CartPlus: ImageVector
    get() {
        if (_cartPlus != null) {
            return _cartPlus!!
        }
        _cartPlus = Builder(
            name = "CartPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.75f, 9.0002f)
                curveTo(13.75f, 8.586f, 13.4142f, 8.2502f, 13.0f, 8.2502f)
                curveTo(12.5858f, 8.2502f, 12.25f, 8.586f, 12.25f, 9.0002f)
                verticalLineTo(10.2502f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 10.2502f, 10.25f, 10.586f, 10.25f, 11.0002f)
                curveTo(10.25f, 11.4144f, 10.5858f, 11.7502f, 11.0f, 11.7502f)
                horizontalLineTo(12.25f)
                verticalLineTo(13.0002f)
                curveTo(12.25f, 13.4144f, 12.5858f, 13.7502f, 13.0f, 13.7502f)
                curveTo(13.4142f, 13.7502f, 13.75f, 13.4144f, 13.75f, 13.0002f)
                verticalLineTo(11.7502f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 11.7502f, 15.75f, 11.4144f, 15.75f, 11.0002f)
                curveTo(15.75f, 10.586f, 15.4142f, 10.2502f, 15.0f, 10.2502f)
                horizontalLineTo(13.75f)
                verticalLineTo(9.0002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.2925f, 2.7515f)
                curveTo(1.4299f, 2.3607f, 1.858f, 2.1553f, 2.2488f, 2.2927f)
                lineTo(2.5502f, 2.3986f)
                curveTo(3.1667f, 2.6154f, 3.6903f, 2.7994f, 4.1024f, 3.0016f)
                curveTo(4.5431f, 3.2178f, 4.9209f, 3.4842f, 5.2051f, 3.9f)
                curveTo(5.4871f, 4.3127f, 5.6035f, 4.7654f, 5.6572f, 5.2618f)
                curveTo(5.6611f, 5.2973f, 5.6646f, 5.3334f, 5.6679f, 5.3702f)
                lineTo(17.1201f, 5.3702f)
                curveTo(17.9387f, 5.3702f, 18.7733f, 5.3702f, 19.4604f, 5.447f)
                curveTo(19.8101f, 5.4861f, 20.1567f, 5.5484f, 20.4632f, 5.6561f)
                curveTo(20.7637f, 5.7617f, 21.094f, 5.9346f, 21.329f, 6.24f)
                curveTo(21.7108f, 6.7364f, 21.7776f, 7.3144f, 21.7414f, 7.9006f)
                curveTo(21.7069f, 8.4587f, 21.5684f, 9.1526f, 21.4037f, 9.9775f)
                lineTo(21.3933f, 10.0298f)
                lineTo(21.3923f, 10.0344f)
                lineTo(20.8834f, 12.5036f)
                curveTo(20.7337f, 13.23f, 20.6078f, 13.8413f, 20.4453f, 14.3234f)
                curveTo(20.2729f, 14.8349f, 20.0339f, 15.2844f, 19.6074f, 15.632f)
                curveTo(19.1809f, 15.9796f, 18.6923f, 16.1229f, 18.1566f, 16.1884f)
                curveTo(17.6516f, 16.2502f, 17.0276f, 16.2502f, 16.286f, 16.2502f)
                lineTo(10.8802f, 16.2502f)
                curveTo(9.5345f, 16.2502f, 8.4446f, 16.2502f, 7.5864f, 16.1285f)
                curveTo(6.6901f, 16.0015f, 5.9373f, 15.7288f, 5.3435f, 15.1024f)
                curveTo(4.7972f, 14.5263f, 4.5051f, 13.9146f, 4.3588f, 13.0603f)
                curveTo(4.2217f, 12.2601f, 4.2081f, 11.2127f, 4.2081f, 9.7602f)
                verticalLineTo(7.0386f)
                curveTo(4.2081f, 6.2986f, 4.2071f, 5.8034f, 4.1659f, 5.4232f)
                curveTo(4.1266f, 5.0598f, 4.0569f, 4.8784f, 3.9666f, 4.7463f)
                curveTo(3.8786f, 4.6175f, 3.7449f, 4.497f, 3.4417f, 4.3483f)
                curveTo(3.1188f, 4.1898f, 2.6801f, 4.0343f, 2.0125f, 3.7996f)
                lineTo(1.7513f, 3.7078f)
                curveTo(1.3605f, 3.5704f, 1.1551f, 3.1422f, 1.2925f, 2.7515f)
                close()
                moveTo(5.7081f, 6.8702f)
                lineTo(5.7081f, 9.7602f)
                curveTo(5.7081f, 11.2492f, 5.7261f, 12.1581f, 5.8373f, 12.8071f)
                curveTo(5.9391f, 13.402f, 6.1118f, 13.7327f, 6.432f, 14.0704f)
                curveTo(6.7045f, 14.3578f, 7.0822f, 14.542f, 7.797f, 14.6434f)
                curveTo(8.5377f, 14.7484f, 9.5207f, 14.7502f, 10.9375f, 14.7502f)
                horizontalLineTo(16.2404f)
                curveTo(17.0397f, 14.7502f, 17.5712f, 14.7489f, 17.9744f, 14.6996f)
                curveTo(18.3571f, 14.6527f, 18.5346f, 14.5712f, 18.6598f, 14.4692f)
                curveTo(18.7851f, 14.3672f, 18.9007f, 14.2097f, 19.0238f, 13.8444f)
                curveTo(19.1535f, 13.4595f, 19.2621f, 12.9391f, 19.4235f, 12.1563f)
                lineTo(19.9223f, 9.7361f)
                lineTo(19.9227f, 9.7339f)
                curveTo(20.1004f, 8.844f, 20.2169f, 8.2517f, 20.2442f, 7.8082f)
                curveTo(20.2702f, 7.3867f, 20.2041f, 7.2395f, 20.1427f, 7.1581f)
                curveTo(20.1365f, 7.1528f, 20.093f, 7.1159f, 19.9659f, 7.0712f)
                curveTo(19.8105f, 7.0166f, 19.5893f, 6.9707f, 19.2937f, 6.9377f)
                curveTo(18.6989f, 6.8712f, 17.9452f, 6.8702f, 17.0889f, 6.8702f)
                horizontalLineTo(5.7081f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.25f, 19.5002f)
                curveTo(5.25f, 20.7428f, 6.2574f, 21.7502f, 7.5f, 21.7502f)
                curveTo(8.7427f, 21.7502f, 9.75f, 20.7428f, 9.75f, 19.5002f)
                curveTo(9.75f, 18.2576f, 8.7427f, 17.2502f, 7.5f, 17.2502f)
                curveTo(6.2574f, 17.2502f, 5.25f, 18.2576f, 5.25f, 19.5002f)
                close()
                moveTo(7.5f, 20.2502f)
                curveTo(7.0858f, 20.2502f, 6.75f, 19.9144f, 6.75f, 19.5002f)
                curveTo(6.75f, 19.086f, 7.0858f, 18.7502f, 7.5f, 18.7502f)
                curveTo(7.9142f, 18.7502f, 8.25f, 19.086f, 8.25f, 19.5002f)
                curveTo(8.25f, 19.9144f, 7.9142f, 20.2502f, 7.5f, 20.2502f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.25f, 19.5003f)
                curveTo(14.25f, 20.7429f, 15.2574f, 21.7503f, 16.5f, 21.7503f)
                curveTo(17.7427f, 21.7503f, 18.75f, 20.7429f, 18.75f, 19.5003f)
                curveTo(18.75f, 18.2576f, 17.7427f, 17.2503f, 16.5f, 17.2503f)
                curveTo(15.2574f, 17.2503f, 14.25f, 18.2576f, 14.25f, 19.5003f)
                close()
                moveTo(16.5f, 20.2503f)
                curveTo(16.0858f, 20.2503f, 15.75f, 19.9145f, 15.75f, 19.5003f)
                curveTo(15.75f, 19.0861f, 16.0858f, 18.7503f, 16.5f, 18.7503f)
                curveTo(16.9142f, 18.7503f, 17.25f, 19.0861f, 17.25f, 19.5003f)
                curveTo(17.25f, 19.9145f, 16.9142f, 20.2503f, 16.5f, 20.2503f)
                close()
            }
        }
            .build()
        return _cartPlus!!
    }

private var _cartPlus: ImageVector? = null
