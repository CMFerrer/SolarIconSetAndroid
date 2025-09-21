package dev.chiksmedina.solar.outline.essentionalui

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
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.HomeSmileAngle: ImageVector
    get() {
        if (_homeSmileAngle != null) {
            return _homeSmileAngle!!
        }
        _homeSmileAngle = Builder(
            name = "HomeSmileAngle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.4466f, 15.3975f)
                curveTo(9.1138f, 15.1508f, 8.6441f, 15.2207f, 8.3975f, 15.5534f)
                curveTo(8.1508f, 15.8862f, 8.2206f, 16.3559f, 8.5534f, 16.6026f)
                curveTo(9.5258f, 17.3233f, 10.715f, 17.75f, 12.0f, 17.75f)
                curveTo(13.285f, 17.75f, 14.4742f, 17.3233f, 15.4466f, 16.6026f)
                curveTo(15.7794f, 16.3559f, 15.8492f, 15.8862f, 15.6025f, 15.5534f)
                curveTo(15.3559f, 15.2207f, 14.8861f, 15.1508f, 14.5534f, 15.3975f)
                curveTo(13.825f, 15.9374f, 12.9459f, 16.25f, 12.0f, 16.25f)
                curveTo(11.0541f, 16.25f, 10.1749f, 15.9374f, 9.4466f, 15.3975f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9999f, 1.2502f)
                curveTo(11.2749f, 1.2502f, 10.6133f, 1.4494f, 9.8892f, 1.7874f)
                curveTo(9.1882f, 2.1145f, 8.3776f, 2.5974f, 7.3617f, 3.2026f)
                lineTo(5.9061f, 4.0697f)
                curveTo(4.787f, 4.7363f, 3.8953f, 5.2675f, 3.2201f, 5.7755f)
                curveTo(2.523f, 6.2999f, 1.9999f, 6.8398f, 1.659f, 7.551f)
                curveTo(1.3179f, 8.2624f, 1.2255f, 9.007f, 1.2551f, 9.8761f)
                curveTo(1.2838f, 10.7173f, 1.431f, 11.7399f, 1.6155f, 13.0221f)
                lineTo(1.9078f, 15.0539f)
                curveTo(2.1452f, 16.7038f, 2.3336f, 18.0131f, 2.615f, 19.0324f)
                curveTo(2.9051f, 20.0832f, 3.3168f, 20.9172f, 4.0596f, 21.5568f)
                curveTo(4.8017f, 22.1958f, 5.6898f, 22.4817f, 6.7762f, 22.6179f)
                curveTo(7.8314f, 22.7503f, 9.1627f, 22.7503f, 10.8422f, 22.7502f)
                horizontalLineTo(13.1576f)
                curveTo(14.8371f, 22.7503f, 16.1684f, 22.7503f, 17.2236f, 22.6179f)
                curveTo(18.3101f, 22.4817f, 19.1981f, 22.1958f, 19.9403f, 21.5568f)
                curveTo(20.6831f, 20.9172f, 21.0947f, 20.0832f, 21.3848f, 19.0324f)
                curveTo(21.6662f, 18.0131f, 21.8546f, 16.7038f, 22.092f, 15.054f)
                lineTo(22.3844f, 13.0221f)
                curveTo(22.5689f, 11.7399f, 22.716f, 10.7173f, 22.7447f, 9.8761f)
                curveTo(22.7744f, 9.007f, 22.6819f, 8.2624f, 22.3408f, 7.551f)
                curveTo(21.9999f, 6.8398f, 21.4768f, 6.2999f, 20.7798f, 5.7755f)
                curveTo(20.1046f, 5.2675f, 19.2128f, 4.7363f, 18.0937f, 4.0697f)
                lineTo(16.6381f, 3.2026f)
                curveTo(15.6222f, 2.5974f, 14.8116f, 2.1145f, 14.1106f, 1.7874f)
                curveTo(13.3865f, 1.4494f, 12.725f, 1.2502f, 11.9999f, 1.2502f)
                close()
                moveTo(8.0955f, 4.5115f)
                curveTo(9.153f, 3.8815f, 9.8991f, 3.4381f, 10.5236f, 3.1466f)
                curveTo(11.1327f, 2.8623f, 11.5707f, 2.7502f, 11.9999f, 2.7502f)
                curveTo(12.4292f, 2.7502f, 12.8671f, 2.8623f, 13.4762f, 3.1466f)
                curveTo(14.1007f, 3.4381f, 14.8468f, 3.8815f, 15.9043f, 4.5114f)
                lineTo(17.2892f, 5.3364f)
                curveTo(18.4535f, 6.03f, 19.2751f, 6.5206f, 19.878f, 6.9742f)
                curveTo(20.4664f, 7.4169f, 20.7887f, 7.7832f, 20.9882f, 8.1994f)
                curveTo(21.1876f, 8.6153f, 21.2705f, 9.0936f, 21.2456f, 9.8249f)
                curveTo(21.22f, 10.5748f, 21.0855f, 11.5166f, 20.8935f, 12.8513f)
                lineTo(20.6147f, 14.7887f)
                curveTo(20.3682f, 16.5018f, 20.192f, 17.7165f, 19.9389f, 18.6332f)
                curveTo(19.6915f, 19.5291f, 19.3938f, 20.0479f, 18.9615f, 20.4201f)
                curveTo(18.5286f, 20.7928f, 17.9675f, 21.0129f, 17.0369f, 21.1296f)
                curveTo(16.0859f, 21.2489f, 14.8487f, 21.2502f, 13.106f, 21.2502f)
                horizontalLineTo(10.8938f)
                curveTo(9.1511f, 21.2502f, 7.914f, 21.2489f, 6.9629f, 21.1296f)
                curveTo(6.0324f, 21.0129f, 5.4712f, 20.7928f, 5.0383f, 20.4201f)
                curveTo(4.6061f, 20.0479f, 4.3083f, 19.5291f, 4.0609f, 18.6332f)
                curveTo(3.8078f, 17.7165f, 3.6316f, 16.5018f, 3.3851f, 14.7886f)
                lineTo(3.1063f, 12.8513f)
                curveTo(2.9143f, 11.5165f, 2.7798f, 10.5748f, 2.7542f, 9.8249f)
                curveTo(2.7293f, 9.0936f, 2.8122f, 8.6153f, 3.0116f, 8.1994f)
                curveTo(3.2111f, 7.7832f, 3.5334f, 7.4169f, 4.1218f, 6.9742f)
                curveTo(4.7247f, 6.5206f, 5.5463f, 6.03f, 6.7106f, 5.3364f)
                lineTo(8.0955f, 4.5115f)
                close()
            }
        }
            .build()
        return _homeSmileAngle!!
    }

private var _homeSmileAngle: ImageVector? = null
