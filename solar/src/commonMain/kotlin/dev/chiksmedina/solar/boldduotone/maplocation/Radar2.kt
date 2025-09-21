package dev.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MapLocationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.1254f, 6.8234f)
                curveTo(11.8458f, 6.7012f, 12.6039f, 6.7282f, 13.3584f, 6.9303f)
                curveTo(16.1583f, 7.6806f, 17.8198f, 10.5585f, 17.0696f, 13.3584f)
                curveTo(16.3194f, 16.1583f, 13.4414f, 17.8199f, 10.6415f, 17.0697f)
                curveTo(7.8416f, 16.3194f, 6.18f, 13.4415f, 6.9303f, 10.6416f)
                curveTo(7.0585f, 10.1629f, 7.2485f, 9.7184f, 7.4891f, 9.3139f)
                lineTo(8.1977f, 9.8874f)
                curveTo(7.8494f, 10.5131f, 7.6508f, 11.2339f, 7.6508f, 12.0f)
                curveTo(7.6508f, 14.4019f, 9.598f, 16.3491f, 11.9999f, 16.3491f)
                curveTo(14.4019f, 16.3491f, 16.349f, 14.4019f, 16.349f, 12.0f)
                curveTo(16.349f, 9.5981f, 14.4019f, 7.6509f, 11.9999f, 7.6509f)
                curveTo(11.5857f, 7.6509f, 11.2499f, 7.9867f, 11.2499f, 8.4009f)
                curveTo(11.2499f, 8.8151f, 11.5857f, 9.1509f, 11.9999f, 9.1509f)
                curveTo(13.5735f, 9.1509f, 14.849f, 10.4265f, 14.849f, 12.0f)
                curveTo(14.849f, 13.5735f, 13.5735f, 14.8491f, 11.9999f, 14.8491f)
                curveTo(10.4264f, 14.8491f, 9.1508f, 13.5735f, 9.1508f, 12.0f)
                curveTo(9.1508f, 11.5916f, 9.2364f, 11.2038f, 9.3909f, 10.8531f)
                lineTo(11.5281f, 12.583f)
                curveTo(11.8501f, 12.8436f, 12.3223f, 12.7938f, 12.5829f, 12.4718f)
                curveTo(12.8435f, 12.1499f, 12.7938f, 11.6776f, 12.4718f, 11.417f)
                lineTo(8.274f, 8.0194f)
                curveTo(7.7125f, 7.5649f, 6.8084f, 7.6072f, 6.3555f, 8.2979f)
                curveTo(5.9709f, 8.8846f, 5.6723f, 9.541f, 5.4814f, 10.2534f)
                curveTo(4.5167f, 13.8535f, 6.6532f, 17.5539f, 10.2533f, 18.5186f)
                curveTo(13.8534f, 19.4832f, 17.5539f, 17.3467f, 18.5185f, 13.7466f)
                curveTo(19.4831f, 10.1465f, 17.3467f, 6.4461f, 13.7466f, 5.4814f)
                curveTo(12.7796f, 5.2223f, 11.8033f, 5.1869f, 10.8745f, 5.3445f)
                curveTo(10.4661f, 5.4138f, 10.1912f, 5.801f, 10.2605f, 6.2094f)
                curveTo(10.3298f, 6.6178f, 10.717f, 6.8927f, 11.1254f, 6.8234f)
                close()
            }
        }
            .build()
        return _radar2!!
    }

private var _radar2: ImageVector? = null
