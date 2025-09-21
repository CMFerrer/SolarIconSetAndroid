package dev.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.Radar2: ImageVector
    get() {
        if (_radar2 != null) {
            return _radar2!!
        }
        _radar2 = Builder(
            name = "Radar2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(13.3584f, 6.9303f)
                curveTo(12.604f, 6.7282f, 11.8458f, 6.7012f, 11.1255f, 6.8234f)
                curveTo(10.7171f, 6.8927f, 10.3299f, 6.6178f, 10.2606f, 6.2094f)
                curveTo(10.1913f, 5.801f, 10.4662f, 5.4138f, 10.8745f, 5.3445f)
                curveTo(11.8033f, 5.1869f, 12.7796f, 5.2223f, 13.7466f, 5.4814f)
                curveTo(17.3467f, 6.4461f, 19.4832f, 10.1465f, 18.5186f, 13.7466f)
                curveTo(17.5539f, 17.3467f, 13.8535f, 19.4832f, 10.2534f, 18.5186f)
                curveTo(6.6533f, 17.5539f, 4.5168f, 13.8535f, 5.4814f, 10.2534f)
                curveTo(5.6723f, 9.541f, 5.971f, 8.8846f, 6.3556f, 8.2979f)
                curveTo(6.8085f, 7.6072f, 7.7125f, 7.5649f, 8.274f, 8.0194f)
                lineTo(12.4718f, 11.417f)
                curveTo(12.7938f, 11.6776f, 12.8436f, 12.1499f, 12.583f, 12.4718f)
                curveTo(12.3224f, 12.7938f, 11.8501f, 12.8436f, 11.5282f, 12.583f)
                lineTo(9.3909f, 10.8531f)
                curveTo(9.2365f, 11.2038f, 9.1509f, 11.5916f, 9.1509f, 12.0f)
                curveTo(9.1509f, 13.5735f, 10.4265f, 14.8491f, 12.0f, 14.8491f)
                curveTo(13.5735f, 14.8491f, 14.8491f, 13.5735f, 14.8491f, 12.0f)
                curveTo(14.8491f, 10.4265f, 13.5735f, 9.1509f, 12.0f, 9.1509f)
                curveTo(11.5858f, 9.1509f, 11.25f, 8.8151f, 11.25f, 8.4009f)
                curveTo(11.25f, 7.9867f, 11.5858f, 7.6509f, 12.0f, 7.6509f)
                curveTo(14.4019f, 7.6509f, 16.3491f, 9.5981f, 16.3491f, 12.0f)
                curveTo(16.3491f, 14.4019f, 14.4019f, 16.3491f, 12.0f, 16.3491f)
                curveTo(9.5981f, 16.3491f, 7.6509f, 14.4019f, 7.6509f, 12.0f)
                curveTo(7.6509f, 11.2339f, 7.8495f, 10.5131f, 8.1977f, 9.8874f)
                lineTo(7.4892f, 9.3139f)
                curveTo(7.2486f, 9.7184f, 7.0586f, 10.1629f, 6.9303f, 10.6416f)
                curveTo(6.1801f, 13.4415f, 7.8417f, 16.3194f, 10.6416f, 17.0697f)
                curveTo(13.4415f, 17.8199f, 16.3194f, 16.1583f, 17.0697f, 13.3584f)
                curveTo(17.8199f, 10.5585f, 16.1583f, 7.6806f, 13.3584f, 6.9303f)
                close()
            }
        }
            .build()
        return _radar2!!
    }

private var _radar2: ImageVector? = null
