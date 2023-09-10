package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.HomeAddAngle: ImageVector
    get() {
        if (_homeAddAngle != null) {
            return _homeAddAngle!!
        }
        _homeAddAngle = Builder(
            name = "HomeAddAngle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 10.0f)
                curveTo(12.75f, 9.5858f, 12.4142f, 9.25f, 12.0f, 9.25f)
                curveTo(11.5858f, 9.25f, 11.25f, 9.5858f, 11.25f, 10.0f)
                lineTo(11.25f, 12.2501f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 12.2501f, 8.25f, 12.5858f, 8.25f, 13.0001f)
                curveTo(8.25f, 13.4143f, 8.5858f, 13.7501f, 9.0f, 13.7501f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.0f)
                curveTo(11.25f, 16.4142f, 11.5858f, 16.75f, 12.0f, 16.75f)
                curveTo(12.4142f, 16.75f, 12.75f, 16.4142f, 12.75f, 16.0f)
                lineTo(12.75f, 13.7501f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 13.7501f, 15.75f, 13.4143f, 15.75f, 13.0001f)
                curveTo(15.75f, 12.5858f, 15.4142f, 12.2501f, 15.0f, 12.2501f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
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
        return _homeAddAngle!!
    }

private var _homeAddAngle: ImageVector? = null
