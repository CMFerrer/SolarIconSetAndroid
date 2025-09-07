package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MedicineGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.9617f, 19.3707f)
                curveTo(6.0194f, 16.9714f, 2.0f, 13.0079f, 2.0f, 9.2604f)
                curveTo(2.0f, 3.3495f, 7.5002f, 0.6626f, 12.0f, 5.4988f)
                curveTo(16.4998f, 0.6626f, 22.0f, 3.3493f, 22.0f, 9.2604f)
                curveTo(22.0f, 13.008f, 17.9806f, 16.9714f, 15.0383f, 19.3707f)
                curveTo(13.7063f, 20.4569f, 13.0403f, 21.0f, 12.0f, 21.0f)
                curveTo(10.9597f, 21.0f, 10.2937f, 20.4569f, 8.9617f, 19.3707f)
                close()
                moveTo(10.0932f, 10.7463f)
                curveTo(10.1827f, 10.6184f, 10.2571f, 10.5122f, 10.3233f, 10.4213f)
                curveTo(10.3793f, 10.5188f, 10.4418f, 10.6324f, 10.517f, 10.7692f)
                lineTo(12.2273f, 13.8787f)
                curveTo(12.3933f, 14.1808f, 12.5562f, 14.4771f, 12.7197f, 14.6921f)
                curveTo(12.8947f, 14.9221f, 13.2023f, 15.2374f, 13.6954f, 15.2466f)
                curveTo(14.1884f, 15.2559f, 14.5077f, 14.9524f, 14.6912f, 14.7291f)
                curveTo(14.8627f, 14.5204f, 15.0365f, 14.2305f, 15.2138f, 13.9349f)
                lineTo(15.2692f, 13.8425f)
                curveTo(15.49f, 13.4745f, 15.629f, 13.2444f, 15.752f, 13.0782f)
                curveTo(15.8654f, 12.9251f, 15.9309f, 12.8751f, 15.9798f, 12.8475f)
                curveTo(16.0286f, 12.8198f, 16.1052f, 12.7894f, 16.2948f, 12.7709f)
                curveTo(16.5006f, 12.7509f, 16.7694f, 12.7501f, 17.1986f, 12.7501f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 12.7501f, 18.75f, 12.4143f, 18.75f, 12.0001f)
                curveTo(18.75f, 11.5859f, 18.4142f, 11.2501f, 18.0f, 11.2501f)
                lineTo(17.1662f, 11.2501f)
                curveTo(16.7791f, 11.2501f, 16.4367f, 11.2501f, 16.1497f, 11.278f)
                curveTo(15.8385f, 11.3082f, 15.5357f, 11.3751f, 15.2407f, 11.5422f)
                curveTo(14.9457f, 11.7092f, 14.7325f, 11.9344f, 14.5465f, 12.1857f)
                curveTo(14.3749f, 12.4174f, 14.1988f, 12.711f, 13.9996f, 13.043f)
                lineTo(13.9521f, 13.1222f)
                curveTo(13.8654f, 13.2668f, 13.793f, 13.3872f, 13.7284f, 13.4906f)
                curveTo(13.6676f, 13.3849f, 13.5999f, 13.2618f, 13.5186f, 13.1141f)
                lineTo(11.8092f, 10.006f)
                curveTo(11.6551f, 9.7256f, 11.5015f, 9.4463f, 11.3458f, 9.2415f)
                curveTo(11.1756f, 9.0177f, 10.8839f, 8.7219f, 10.4164f, 8.6967f)
                curveTo(9.9489f, 8.6715f, 9.627f, 8.9341f, 9.4337f, 9.1382f)
                curveTo(9.2568f, 9.3251f, 9.0741f, 9.5863f, 8.8907f, 9.8484f)
                lineTo(8.5813f, 10.2904f)
                curveTo(8.3542f, 10.6149f, 8.2118f, 10.8171f, 8.0885f, 10.9629f)
                curveTo(7.975f, 11.0971f, 7.9119f, 11.1411f, 7.8654f, 11.1653f)
                curveTo(7.8188f, 11.1896f, 7.7466f, 11.216f, 7.5716f, 11.232f)
                curveTo(7.3814f, 11.2494f, 7.1341f, 11.2501f, 6.738f, 11.2501f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 11.2501f, 5.25f, 11.5859f, 5.25f, 12.0001f)
                curveTo(5.25f, 12.4143f, 5.5858f, 12.7501f, 6.0f, 12.7501f)
                lineTo(6.7681f, 12.7501f)
                curveTo(7.1251f, 12.7501f, 7.4415f, 12.7501f, 7.708f, 12.7258f)
                curveTo(7.9971f, 12.6994f, 8.279f, 12.6411f, 8.5581f, 12.4958f)
                curveTo(8.8371f, 12.3505f, 9.0466f, 12.153f, 9.234f, 11.9313f)
                curveTo(9.4068f, 11.7269f, 9.5882f, 11.4677f, 9.7929f, 11.1752f)
                lineTo(10.0932f, 10.7463f)
                close()
            }
        }
            .build()
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
