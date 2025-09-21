package dev.chiksmedina.solar.broken.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MedicineGroup

val MedicineGroup.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = Builder(
            name = "HeartPulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 12.0f)
                horizontalLineTo(17.1986f)
                curveTo(16.3689f, 12.0f, 15.9541f, 12.0f, 15.6102f, 12.1947f)
                curveTo(15.2664f, 12.3894f, 15.0529f, 12.7451f, 14.6261f, 13.4565f)
                lineTo(14.5952f, 13.508f)
                curveTo(14.1976f, 14.1707f, 13.9987f, 14.5021f, 13.7095f, 14.4967f)
                curveTo(13.4202f, 14.4912f, 13.2339f, 14.1526f, 12.8615f, 13.4754f)
                lineTo(11.1742f, 10.4076f)
                curveTo(10.8269f, 9.7762f, 10.6533f, 9.4605f, 10.3759f, 9.4455f)
                curveTo(10.0986f, 9.4305f, 9.892f, 9.7257f, 9.4788f, 10.3161f)
                lineTo(9.1957f, 10.7204f)
                curveTo(8.7568f, 11.3474f, 8.5373f, 11.6609f, 8.2117f, 11.8305f)
                curveTo(7.8861f, 12.0f, 7.5034f, 12.0f, 6.738f, 12.0f)
                horizontalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.9617f, 18.9108f)
                lineTo(9.4261f, 18.3219f)
                lineTo(8.9617f, 18.9108f)
                close()
                moveTo(12.0f, 5.5006f)
                lineTo(11.4596f, 6.0207f)
                curveTo(11.601f, 6.1676f, 11.7961f, 6.2506f, 12.0f, 6.2506f)
                curveTo(12.2039f, 6.2506f, 12.399f, 6.1676f, 12.5404f, 6.0207f)
                lineTo(12.0f, 5.5006f)
                close()
                moveTo(15.0383f, 18.9109f)
                lineTo(15.5026f, 19.4999f)
                lineTo(15.5026f, 19.4999f)
                lineTo(15.0383f, 18.9109f)
                close()
                moveTo(12.0f, 20.4859f)
                lineTo(12.0f, 19.7359f)
                lineTo(12.0f, 20.4859f)
                close()
                moveTo(2.6567f, 13.3964f)
                curveTo(2.8756f, 13.748f, 3.3381f, 13.8556f, 3.6897f, 13.6367f)
                curveTo(4.0414f, 13.4178f, 4.149f, 12.9552f, 3.93f, 12.6036f)
                lineTo(2.6567f, 13.3964f)
                close()
                moveTo(6.5297f, 15.7718f)
                curveTo(6.2365f, 15.4793f, 5.7616f, 15.4798f, 5.469f, 15.7731f)
                curveTo(5.1765f, 16.0663f, 5.1771f, 16.5412f, 5.4703f, 16.8337f)
                lineTo(6.5297f, 15.7718f)
                close()
                moveTo(2.75f, 9.1371f)
                curveTo(2.75f, 6.3342f, 4.0072f, 4.5951f, 5.5792f, 3.9971f)
                curveTo(7.1555f, 3.3975f, 9.3513f, 3.8302f, 11.4596f, 6.0207f)
                lineTo(12.5404f, 4.9805f)
                curveTo(10.1489f, 2.4958f, 7.3447f, 1.7207f, 5.0459f, 2.5951f)
                curveTo(2.7429f, 3.4712f, 1.25f, 5.8878f, 1.25f, 9.1371f)
                horizontalLineTo(2.75f)
                close()
                moveTo(15.5026f, 19.4999f)
                curveTo(16.9949f, 18.3234f, 18.7837f, 16.7461f, 20.2061f, 14.9838f)
                curveTo(21.6126f, 13.2412f, 22.75f, 11.2089f, 22.75f, 9.137f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 10.688f, 20.3777f, 12.3829f, 19.0389f, 14.0417f)
                curveTo(17.716f, 15.6807f, 16.0239f, 17.1788f, 14.574f, 18.3219f)
                lineTo(15.5026f, 19.4999f)
                close()
                moveTo(22.75f, 9.137f)
                curveTo(22.75f, 5.8878f, 21.2571f, 3.4711f, 18.9541f, 2.5951f)
                curveTo(16.6553f, 1.7207f, 13.8511f, 2.4958f, 11.4596f, 4.9805f)
                lineTo(12.5404f, 6.0207f)
                curveTo(14.6487f, 3.8302f, 16.8445f, 3.3975f, 18.4208f, 3.9971f)
                curveTo(19.9928f, 4.5951f, 21.25f, 6.3342f, 21.25f, 9.137f)
                horizontalLineTo(22.75f)
                close()
                moveTo(8.4974f, 19.4998f)
                curveTo(9.7717f, 20.5044f, 10.6501f, 21.2359f, 12.0f, 21.2359f)
                lineTo(12.0f, 19.7359f)
                curveTo(11.2693f, 19.7359f, 10.8157f, 19.4174f, 9.4261f, 18.3219f)
                lineTo(8.4974f, 19.4998f)
                close()
                moveTo(14.574f, 18.3219f)
                curveTo(13.1843f, 19.4174f, 12.7307f, 19.7359f, 12.0f, 19.7359f)
                lineTo(12.0f, 21.2359f)
                curveTo(13.3499f, 21.2359f, 14.2283f, 20.5044f, 15.5026f, 19.4999f)
                lineTo(14.574f, 18.3219f)
                close()
                moveTo(3.93f, 12.6036f)
                curveTo(3.184f, 11.4054f, 2.75f, 10.2312f, 2.75f, 9.1371f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 10.617f, 1.8305f, 12.0695f, 2.6567f, 13.3964f)
                lineTo(3.93f, 12.6036f)
                close()
                moveTo(9.4261f, 18.3219f)
                curveTo(8.5091f, 17.599f, 7.4909f, 16.7307f, 6.5297f, 15.7718f)
                lineTo(5.4703f, 16.8337f)
                curveTo(6.4835f, 17.8445f, 7.5482f, 18.7515f, 8.4974f, 19.4998f)
                lineTo(9.4261f, 18.3219f)
                close()
            }
        }
            .build()
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
