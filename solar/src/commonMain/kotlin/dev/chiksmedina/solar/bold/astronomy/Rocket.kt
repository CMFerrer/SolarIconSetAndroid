package dev.chiksmedina.solar.bold.astronomy

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
import dev.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(
            name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0343f, 5.963f)
                lineTo(6.4911f, 8.4986f)
                curveTo(6.0237f, 8.9646f, 5.5949f, 9.3921f, 5.2562f, 9.7786f)
                curveTo(5.0388f, 10.0267f, 4.8215f, 10.2984f, 4.6374f, 10.5985f)
                lineTo(4.6126f, 10.5738f)
                curveTo(4.5655f, 10.5269f, 4.542f, 10.5034f, 4.5184f, 10.4805f)
                curveTo(4.0764f, 10.0516f, 3.5564f, 9.7106f, 2.9864f, 9.4757f)
                curveTo(2.9559f, 9.4632f, 2.925f, 9.4509f, 2.8631f, 9.4264f)
                lineTo(2.4845f, 9.2764f)
                curveTo(1.9715f, 9.0731f, 1.8348f, 8.4128f, 2.2251f, 8.0237f)
                curveTo(3.3454f, 6.9068f, 4.6903f, 5.5659f, 5.3394f, 5.2966f)
                curveTo(5.9118f, 5.0591f, 6.5302f, 4.9801f, 7.1266f, 5.0682f)
                curveTo(7.6731f, 5.149f, 8.1901f, 5.4297f, 9.0343f, 5.963f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.3767f, 19.3132f)
                curveTo(13.5816f, 19.5212f, 13.7177f, 19.6681f, 13.8408f, 19.8251f)
                curveTo(14.0031f, 20.0322f, 14.1483f, 20.2522f, 14.2748f, 20.4829f)
                curveTo(14.4172f, 20.7426f, 14.5278f, 21.02f, 14.749f, 21.5748f)
                curveTo(14.929f, 22.0265f, 15.5272f, 22.1459f, 15.8746f, 21.7995f)
                lineTo(15.9586f, 21.7157f)
                curveTo(17.0788f, 20.5988f, 18.4237f, 19.2579f, 18.6938f, 18.6108f)
                curveTo(18.9321f, 18.04f, 19.0113f, 17.4235f, 18.9229f, 16.8289f)
                curveTo(18.8419f, 16.2841f, 18.5605f, 15.7688f, 18.0256f, 14.9273f)
                lineTo(15.474f, 17.4713f)
                curveTo(14.9959f, 17.9479f, 14.5576f, 18.385f, 14.1612f, 18.7273f)
                curveTo(13.9236f, 18.9325f, 13.6637f, 19.1376f, 13.3767f, 19.3132f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.4467f, 16.3769f)
                lineTo(20.2935f, 10.5476f)
                curveTo(21.1356f, 9.7081f, 21.5566f, 9.2884f, 21.7783f, 8.7546f)
                curveTo(22.0001f, 8.2208f, 22.0001f, 7.6272f, 22.0001f, 6.44f)
                verticalLineTo(5.8728f)
                curveTo(22.0001f, 4.0471f, 22.0001f, 3.1343f, 21.4312f, 2.5672f)
                curveTo(20.8624f, 2.0f, 19.9468f, 2.0f, 18.1157f, 2.0f)
                horizontalLineTo(17.5468f)
                curveTo(16.356f, 2.0f, 15.7606f, 2.0f, 15.2252f, 2.2211f)
                curveTo(14.6898f, 2.4422f, 14.2688f, 2.8619f, 13.4268f, 3.7015f)
                lineTo(7.5799f, 9.5308f)
                curveTo(6.596f, 10.5117f, 5.9859f, 11.12f, 5.7497f, 11.7075f)
                curveTo(5.675f, 11.8931f, 5.6377f, 12.0767f, 5.6377f, 12.2692f)
                curveTo(5.6377f, 13.0713f, 6.2851f, 13.7168f, 7.5799f, 15.0077f)
                lineTo(7.7539f, 15.1812f)
                lineTo(9.7924f, 13.1123f)
                curveTo(10.0832f, 12.8172f, 10.558f, 12.8137f, 10.8531f, 13.1044f)
                curveTo(11.1481f, 13.3951f, 11.1516f, 13.87f, 10.8609f, 14.1651f)
                lineTo(8.8162f, 16.2403f)
                lineTo(8.9533f, 16.3769f)
                curveTo(10.2481f, 17.6679f, 10.8955f, 18.3133f, 11.7f, 18.3133f)
                curveTo(11.8777f, 18.3133f, 12.0478f, 18.2818f, 12.2189f, 18.2188f)
                curveTo(12.8222f, 17.9966f, 13.438f, 17.3826f, 14.4467f, 16.3769f)
                close()
                moveTo(17.1935f, 9.5312f)
                curveTo(16.435f, 10.2874f, 15.2053f, 10.2874f, 14.4468f, 9.5312f)
                curveTo(13.6883f, 8.775f, 13.6883f, 7.549f, 14.4468f, 6.7927f)
                curveTo(15.2053f, 6.0365f, 16.435f, 6.0365f, 17.1935f, 6.7927f)
                curveTo(17.952f, 7.549f, 17.952f, 8.775f, 17.1935f, 9.5312f)
                close()
            }
        }
            .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
