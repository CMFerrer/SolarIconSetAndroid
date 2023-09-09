package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.HomeWifiAngle: ImageVector
    get() {
        if (_homeWifiAngle != null) {
            return _homeWifiAngle!!
        }
        _homeWifiAngle = Builder(name = "HomeWifiAngle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5502f, 12.1923f)
                curveTo(9.567f, 8.936f, 14.4329f, 8.936f, 17.4498f, 12.1923f)
                curveTo(17.7313f, 12.4961f, 18.2059f, 12.5142f, 18.5097f, 12.2327f)
                curveTo(18.8136f, 11.9512f, 18.8317f, 11.4767f, 18.5502f, 11.1728f)
                curveTo(14.9396f, 7.2758f, 9.0604f, 7.2758f, 5.4498f, 11.1728f)
                curveTo(5.1683f, 11.4767f, 5.1864f, 11.9512f, 5.4903f, 12.2327f)
                curveTo(5.7941f, 12.5142f, 6.2687f, 12.4961f, 6.5502f, 12.1923f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5502f, 14.3508f)
                curveTo(10.4625f, 12.2867f, 13.5375f, 12.2867f, 15.4498f, 14.3508f)
                curveTo(15.7313f, 14.6546f, 16.2059f, 14.6727f, 16.5097f, 14.3912f)
                curveTo(16.8136f, 14.1097f, 16.8317f, 13.6352f, 16.5502f, 13.3313f)
                curveTo(14.0442f, 10.6265f, 9.9558f, 10.6265f, 7.4498f, 13.3313f)
                curveTo(7.1683f, 13.6352f, 7.1864f, 14.1097f, 7.4903f, 14.3912f)
                curveTo(7.7941f, 14.6727f, 8.2687f, 14.6546f, 8.5502f, 14.3508f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5502f, 16.5097f)
                curveTo(11.3579f, 15.6379f, 12.6421f, 15.6379f, 13.4499f, 16.5097f)
                curveTo(13.7314f, 16.8136f, 14.2059f, 16.8317f, 14.5097f, 16.5502f)
                curveTo(14.8136f, 16.2687f, 14.8317f, 15.7942f, 14.5502f, 15.4903f)
                curveTo(13.1488f, 13.9777f, 10.8512f, 13.9777f, 9.4499f, 15.4903f)
                curveTo(9.1683f, 15.7942f, 9.1865f, 16.2687f, 9.4903f, 16.5502f)
                curveTo(9.7942f, 16.8317f, 10.2687f, 16.8136f, 10.5502f, 16.5097f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9999f, 1.2502f)
                curveTo(11.2748f, 1.2502f, 10.6133f, 1.4494f, 9.8892f, 1.7874f)
                curveTo(9.1882f, 2.1145f, 8.3776f, 2.5974f, 7.3617f, 3.2026f)
                lineTo(5.9061f, 4.0697f)
                curveTo(4.787f, 4.7363f, 3.8952f, 5.2675f, 3.22f, 5.7755f)
                curveTo(2.523f, 6.2999f, 1.9999f, 6.8398f, 1.6589f, 7.551f)
                curveTo(1.3179f, 8.2624f, 1.2254f, 9.007f, 1.2551f, 9.8761f)
                curveTo(1.2838f, 10.7173f, 1.4309f, 11.7399f, 1.6154f, 13.0221f)
                lineTo(1.9078f, 15.0539f)
                curveTo(2.1452f, 16.7038f, 2.3336f, 18.0131f, 2.615f, 19.0324f)
                curveTo(2.9051f, 20.0832f, 3.3167f, 20.9172f, 4.0595f, 21.5568f)
                curveTo(4.8017f, 22.1958f, 5.6897f, 22.4817f, 6.7762f, 22.6179f)
                curveTo(7.8314f, 22.7503f, 9.1627f, 22.7503f, 10.8422f, 22.7502f)
                horizontalLineTo(13.1575f)
                curveTo(14.837f, 22.7503f, 16.1683f, 22.7503f, 17.2235f, 22.6179f)
                curveTo(18.31f, 22.4817f, 19.198f, 22.1958f, 19.9402f, 21.5568f)
                curveTo(20.683f, 20.9172f, 21.0947f, 20.0832f, 21.3848f, 19.0324f)
                curveTo(21.6662f, 18.0131f, 21.8546f, 16.7038f, 22.092f, 15.054f)
                lineTo(22.3843f, 13.0221f)
                curveTo(22.5688f, 11.7399f, 22.716f, 10.7173f, 22.7447f, 9.8761f)
                curveTo(22.7743f, 9.007f, 22.6819f, 8.2624f, 22.3408f, 7.551f)
                curveTo(21.9999f, 6.8398f, 21.4767f, 6.2999f, 20.7797f, 5.7755f)
                curveTo(20.1045f, 5.2675f, 19.2128f, 4.7363f, 18.0937f, 4.0697f)
                lineTo(16.6381f, 3.2026f)
                curveTo(15.6222f, 2.5974f, 14.8116f, 2.1145f, 14.1106f, 1.7874f)
                curveTo(13.3865f, 1.4494f, 12.7249f, 1.2502f, 11.9999f, 1.2502f)
                close()
                moveTo(8.0955f, 4.5115f)
                curveTo(9.153f, 3.8815f, 9.8991f, 3.4381f, 10.5236f, 3.1466f)
                curveTo(11.1327f, 2.8623f, 11.5706f, 2.7502f, 11.9999f, 2.7502f)
                curveTo(12.4291f, 2.7502f, 12.8671f, 2.8623f, 13.4762f, 3.1466f)
                curveTo(14.1007f, 3.4381f, 14.8468f, 3.8815f, 15.9043f, 4.5114f)
                lineTo(17.2891f, 5.3364f)
                curveTo(18.4535f, 6.03f, 19.2751f, 6.5206f, 19.8779f, 6.9742f)
                curveTo(20.4664f, 7.4169f, 20.7887f, 7.7832f, 20.9882f, 8.1994f)
                curveTo(21.1876f, 8.6153f, 21.2705f, 9.0936f, 21.2456f, 9.8249f)
                curveTo(21.22f, 10.5748f, 21.0855f, 11.5166f, 20.8935f, 12.8513f)
                lineTo(20.6147f, 14.7887f)
                curveTo(20.3682f, 16.5018f, 20.192f, 17.7165f, 19.9389f, 18.6332f)
                curveTo(19.6915f, 19.5291f, 19.3937f, 20.0479f, 18.9615f, 20.4201f)
                curveTo(18.5286f, 20.7928f, 17.9674f, 21.0129f, 17.0369f, 21.1296f)
                curveTo(16.0858f, 21.2489f, 14.8486f, 21.2502f, 13.106f, 21.2502f)
                horizontalLineTo(10.8938f)
                curveTo(9.1511f, 21.2502f, 7.9139f, 21.2489f, 6.9629f, 21.1296f)
                curveTo(6.0323f, 21.0129f, 5.4712f, 20.7928f, 5.0383f, 20.4201f)
                curveTo(4.606f, 20.0479f, 4.3083f, 19.5291f, 4.0609f, 18.6332f)
                curveTo(3.8078f, 17.7165f, 3.6316f, 16.5018f, 3.3851f, 14.7886f)
                lineTo(3.1063f, 12.8513f)
                curveTo(2.9142f, 11.5165f, 2.7798f, 10.5748f, 2.7542f, 9.8249f)
                curveTo(2.7292f, 9.0936f, 2.8122f, 8.6153f, 3.0115f, 8.1994f)
                curveTo(3.2111f, 7.7832f, 3.5333f, 7.4169f, 4.1218f, 6.9742f)
                curveTo(4.7247f, 6.5206f, 5.5463f, 6.03f, 6.7106f, 5.3364f)
                lineTo(8.0955f, 4.5115f)
                close()
            }
        }
        .build()
        return _homeWifiAngle!!
    }

private var _homeWifiAngle: ImageVector? = null
