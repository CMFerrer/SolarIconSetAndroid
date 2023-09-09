package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.MagnetWave: ImageVector
    get() {
        if (_magnetWave != null) {
            return _magnetWave!!
        }
        _magnetWave = Builder(name = "MagnetWave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 3.0f)
                horizontalLineTo(11.0f)
                curveTo(6.0294f, 3.0f, 2.0f, 7.0294f, 2.0f, 12.0f)
                curveTo(2.0f, 16.9706f, 6.0294f, 21.0f, 11.0f, 21.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(10.9444f)
                curveTo(8.4592f, 16.5f, 6.4444f, 14.4853f, 6.4444f, 12.0f)
                curveTo(6.4444f, 9.5147f, 8.4592f, 7.5f, 10.9444f, 7.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.5031f, 14.8459f)
                curveTo(23.3541f, 15.6504f, 23.1541f, 16.3135f, 22.95f, 16.8442f)
                curveTo(22.7463f, 17.374f, 22.5394f, 17.7692f, 22.3775f, 18.039f)
                curveTo(22.2966f, 18.1738f, 22.227f, 18.2772f, 22.1748f, 18.3504f)
                curveTo(22.1487f, 18.3869f, 22.1269f, 18.4159f, 22.1102f, 18.4375f)
                curveTo(22.1019f, 18.4483f, 22.0948f, 18.4572f, 22.0891f, 18.4643f)
                lineTo(22.0816f, 18.4736f)
                lineTo(22.0786f, 18.4772f)
                lineTo(22.0773f, 18.4788f)
                lineTo(22.0762f, 18.4801f)
                curveTo(21.811f, 18.7983f, 21.3381f, 18.8413f, 21.0199f, 18.5762f)
                curveTo(20.7032f, 18.3123f, 20.6591f, 17.8426f, 20.92f, 17.5245f)
                lineTo(20.9235f, 17.52f)
                curveTo(20.9288f, 17.5131f, 20.9393f, 17.4993f, 20.9542f, 17.4785f)
                curveTo(20.984f, 17.4368f, 21.0316f, 17.3667f, 21.0913f, 17.2672f)
                curveTo(21.2106f, 17.0683f, 21.3788f, 16.7509f, 21.55f, 16.3057f)
                curveTo(21.7115f, 15.8858f, 21.8767f, 15.3498f, 22.006f, 14.6893f)
                curveTo(22.1332f, 14.0393f, 22.2258f, 13.2687f, 22.2459f, 12.3695f)
                curveTo(22.2486f, 12.2487f, 22.25f, 12.1255f, 22.25f, 12.0f)
                curveTo(22.25f, 11.4978f, 22.2276f, 11.0332f, 22.1887f, 10.6048f)
                curveTo(22.0719f, 9.3197f, 21.8063f, 8.3607f, 21.55f, 7.6942f)
                curveTo(21.3788f, 7.249f, 21.2106f, 6.9317f, 21.0913f, 6.7327f)
                curveTo(21.0316f, 6.6332f, 20.984f, 6.5632f, 20.9542f, 6.5215f)
                curveTo(20.9393f, 6.5006f, 20.9288f, 6.4868f, 20.9235f, 6.48f)
                lineTo(20.92f, 6.4755f)
                curveTo(20.6591f, 6.1574f, 20.7032f, 5.6877f, 21.0199f, 5.4238f)
                curveTo(21.3381f, 5.1586f, 21.811f, 5.2016f, 22.0762f, 5.5198f)
                lineTo(22.0773f, 5.5212f)
                lineTo(22.0786f, 5.5227f)
                lineTo(22.0816f, 5.5264f)
                lineTo(22.0891f, 5.5356f)
                curveTo(22.0948f, 5.5427f, 22.1019f, 5.5517f, 22.1102f, 5.5624f)
                curveTo(22.1269f, 5.584f, 22.1487f, 5.613f, 22.1748f, 5.6496f)
                curveTo(22.227f, 5.7227f, 22.2966f, 5.8261f, 22.3775f, 5.961f)
                curveTo(22.5394f, 6.2308f, 22.7463f, 6.6259f, 22.95f, 7.1557f)
                curveTo(23.2513f, 7.9389f, 23.5435f, 9.0106f, 23.676f, 10.3991f)
                curveTo(23.7231f, 10.8923f, 23.75f, 11.4255f, 23.75f, 12.0f)
                curveTo(23.75f, 12.0f, 23.75f, 11.9999f, 23.75f, 12.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.75f, 12.0f)
                curveTo(23.75f, 13.0957f, 23.6521f, 14.0415f, 23.5031f, 14.8459f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.1558f, 8.6359f)
                curveTo(19.9546f, 8.2738f, 19.498f, 8.1434f, 19.1359f, 8.3445f)
                curveTo(18.7769f, 8.544f, 18.6456f, 8.9945f, 18.8395f, 9.3551f)
                lineTo(18.8445f, 9.3654f)
                curveTo(18.8513f, 9.3798f, 18.8644f, 9.4085f, 18.8819f, 9.4521f)
                curveTo(18.9168f, 9.5393f, 18.9692f, 9.6866f, 19.0236f, 9.8989f)
                curveTo(19.1324f, 10.323f, 19.2501f, 11.0103f, 19.2501f, 12.0001f)
                curveTo(19.2501f, 12.99f, 19.1324f, 13.6773f, 19.0236f, 14.1014f)
                curveTo(18.9692f, 14.3136f, 18.9168f, 14.4609f, 18.8819f, 14.5482f)
                curveTo(18.8644f, 14.5918f, 18.8513f, 14.6205f, 18.8445f, 14.6349f)
                lineTo(18.8395f, 14.6452f)
                curveTo(18.6456f, 15.0057f, 18.7769f, 15.4563f, 19.1359f, 15.6558f)
                curveTo(19.498f, 15.8569f, 19.9546f, 15.7265f, 20.1558f, 15.3644f)
                lineTo(19.5001f, 15.0001f)
                curveTo(20.1558f, 15.3644f, 20.1558f, 15.3644f, 20.1558f, 15.3644f)
                lineTo(20.1565f, 15.3631f)
                lineTo(20.1573f, 15.3617f)
                lineTo(20.1589f, 15.3586f)
                lineTo(20.1628f, 15.3515f)
                lineTo(20.1724f, 15.3331f)
                curveTo(20.1797f, 15.3191f, 20.1885f, 15.3013f, 20.1988f, 15.2798f)
                curveTo(20.2193f, 15.2368f, 20.2452f, 15.1788f, 20.2746f, 15.1052f)
                curveTo(20.3335f, 14.9581f, 20.4061f, 14.7491f, 20.4766f, 14.4739f)
                curveTo(20.6179f, 13.923f, 20.7501f, 13.1103f, 20.7501f, 12.0001f)
                curveTo(20.7501f, 10.89f, 20.6179f, 10.0773f, 20.4766f, 9.5264f)
                curveTo(20.4061f, 9.2511f, 20.3335f, 9.0422f, 20.2746f, 8.895f)
                curveTo(20.2452f, 8.8215f, 20.2193f, 8.7635f, 20.1988f, 8.7205f)
                curveTo(20.1885f, 8.6989f, 20.1797f, 8.6812f, 20.1724f, 8.6671f)
                lineTo(20.1628f, 8.6488f)
                lineTo(20.1589f, 8.6417f)
                lineTo(20.1573f, 8.6386f)
                lineTo(20.1565f, 8.6372f)
                curveTo(20.1565f, 8.6372f, 20.1558f, 8.6359f, 19.5001f, 9.0001f)
                lineTo(20.1558f, 8.6359f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 7.5f)
                horizontalLineTo(16.5f)
                curveTo(17.3284f, 7.5f, 18.0f, 6.8284f, 18.0f, 6.0f)
                verticalLineTo(4.5f)
                curveTo(18.0f, 3.6716f, 17.3284f, 3.0f, 16.5f, 3.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 16.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.5f)
                curveTo(17.3284f, 21.0f, 18.0f, 20.3284f, 18.0f, 19.5f)
                verticalLineTo(18.0f)
                curveTo(18.0f, 17.1716f, 17.3284f, 16.5f, 16.5f, 16.5f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _magnetWave!!
    }

private var _magnetWave: ImageVector? = null
