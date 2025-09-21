package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.MagnetWave: ImageVector
    get() {
        if (_magnetWave != null) {
            return _magnetWave!!
        }
        _magnetWave = Builder(
            name = "MagnetWave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.6943f, 3.0f)
                horizontalLineTo(11.0f)
                curveTo(6.0294f, 3.0f, 2.0f, 7.0294f, 2.0f, 12.0f)
                curveTo(2.0f, 16.9706f, 6.0294f, 21.0f, 11.0f, 21.0f)
                horizontalLineTo(13.6943f)
                verticalLineTo(16.5f)
                horizontalLineTo(10.9444f)
                curveTo(8.4592f, 16.5f, 6.4444f, 14.4853f, 6.4444f, 12.0f)
                curveTo(6.4444f, 9.5147f, 8.4592f, 7.5f, 10.9444f, 7.5f)
                horizontalLineTo(13.6943f)
                verticalLineTo(3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.1943f, 7.5f)
                horizontalLineTo(16.5f)
                curveTo(17.3284f, 7.5f, 18.0f, 6.8284f, 18.0f, 6.0f)
                verticalLineTo(4.5f)
                curveTo(18.0f, 3.6716f, 17.3284f, 3.0f, 16.5f, 3.0f)
                horizontalLineTo(15.1943f)
                verticalLineTo(7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.1943f, 16.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.5f)
                curveTo(17.3284f, 21.0f, 18.0f, 20.3284f, 18.0f, 19.5f)
                verticalLineTo(18.0f)
                curveTo(18.0f, 17.1716f, 17.3284f, 16.5f, 16.5f, 16.5f)
                horizontalLineTo(15.1943f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.1556f, 8.6358f)
                curveTo(19.9545f, 8.2737f, 19.4979f, 8.1432f, 19.1358f, 8.3444f)
                curveTo(18.7768f, 8.5438f, 18.6455f, 8.9944f, 18.8393f, 9.355f)
                lineTo(18.8443f, 9.3652f)
                curveTo(18.8512f, 9.3796f, 18.8643f, 9.4083f, 18.8818f, 9.452f)
                curveTo(18.9167f, 9.5392f, 18.9691f, 9.6865f, 19.0235f, 9.8988f)
                curveTo(19.1322f, 10.3228f, 19.25f, 11.0101f, 19.25f, 12.0f)
                curveTo(19.25f, 12.9899f, 19.1322f, 13.6772f, 19.0235f, 14.1012f)
                curveTo(18.9691f, 14.3135f, 18.9167f, 14.4608f, 18.8818f, 14.548f)
                curveTo(18.8643f, 14.5917f, 18.8512f, 14.6204f, 18.8443f, 14.6348f)
                lineTo(18.8393f, 14.645f)
                curveTo(18.6455f, 15.0056f, 18.7768f, 15.4562f, 19.1358f, 15.6556f)
                curveTo(19.4979f, 15.8568f, 19.9545f, 15.7263f, 20.1556f, 15.3642f)
                lineTo(19.5f, 15.0f)
                curveTo(20.1556f, 15.3642f, 20.1556f, 15.3642f, 20.1556f, 15.3642f)
                lineTo(20.1563f, 15.3629f)
                lineTo(20.1571f, 15.3615f)
                lineTo(20.1588f, 15.3585f)
                lineTo(20.1626f, 15.3514f)
                lineTo(20.1723f, 15.333f)
                curveTo(20.1795f, 15.3189f, 20.1884f, 15.3012f, 20.1986f, 15.2797f)
                curveTo(20.2191f, 15.2367f, 20.2451f, 15.1787f, 20.2745f, 15.1051f)
                curveTo(20.3333f, 14.9579f, 20.4059f, 14.749f, 20.4765f, 14.4738f)
                curveTo(20.6178f, 13.9228f, 20.75f, 13.1101f, 20.75f, 12.0f)
                curveTo(20.75f, 10.8899f, 20.6178f, 10.0772f, 20.4765f, 9.5262f)
                curveTo(20.4059f, 9.251f, 20.3333f, 9.0421f, 20.2745f, 8.8949f)
                curveTo(20.2451f, 8.8214f, 20.2191f, 8.7633f, 20.1986f, 8.7203f)
                curveTo(20.1884f, 8.6988f, 20.1795f, 8.6811f, 20.1723f, 8.667f)
                lineTo(20.1626f, 8.6486f)
                lineTo(20.1588f, 8.6415f)
                lineTo(20.1571f, 8.6385f)
                lineTo(20.1563f, 8.6371f)
                curveTo(20.1563f, 8.6371f, 20.1556f, 8.6358f, 19.5f, 9.0f)
                lineTo(20.1556f, 8.6358f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(23.75f, 12.0f)
                curveTo(23.75f, 13.0957f, 23.6521f, 14.0415f, 23.5031f, 14.8459f)
                close()
            }
        }
            .build()
        return _magnetWave!!
    }

private var _magnetWave: ImageVector? = null
