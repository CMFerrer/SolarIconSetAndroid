package dev.chiksmedina.solar.outline.medicine

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
import dev.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.Thermometer: ImageVector
    get() {
        if (_thermometer != null) {
            return _thermometer!!
        }
        _thermometer = Builder(
            name = "Thermometer", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0303f, 9.0303f)
                curveTo(16.3232f, 8.7374f, 16.3232f, 8.2626f, 16.0303f, 7.9697f)
                curveTo(15.7374f, 7.6768f, 15.2626f, 7.6768f, 14.9697f, 7.9697f)
                lineTo(8.4697f, 14.4697f)
                curveTo(8.1768f, 14.7626f, 8.1768f, 15.2374f, 8.4697f, 15.5303f)
                curveTo(8.7626f, 15.8232f, 9.2374f, 15.8232f, 9.5303f, 15.5303f)
                lineTo(16.0303f, 9.0303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.3505f, 3.6495f)
                curveTo(18.4846f, 1.7835f, 15.4592f, 1.7835f, 13.5932f, 3.6495f)
                lineTo(4.6509f, 12.5918f)
                curveTo(3.8408f, 13.4019f, 3.4429f, 14.5362f, 3.5694f, 15.6748f)
                lineTo(3.6582f, 16.474f)
                curveTo(3.7006f, 16.8556f, 3.5673f, 17.2359f, 3.2957f, 17.5074f)
                lineTo(2.9121f, 17.891f)
                curveTo(2.0293f, 18.7738f, 2.0293f, 20.2051f, 2.9121f, 21.0879f)
                curveTo(3.7949f, 21.9707f, 5.2262f, 21.9707f, 6.109f, 21.0879f)
                lineTo(6.4926f, 20.7043f)
                curveTo(6.7642f, 20.4327f, 7.1444f, 20.2994f, 7.526f, 20.3418f)
                lineTo(8.3252f, 20.4306f)
                curveTo(9.4637f, 20.5571f, 10.5981f, 20.1592f, 11.4082f, 19.3491f)
                lineTo(20.3505f, 10.4068f)
                curveTo(22.2165f, 8.5408f, 22.2165f, 5.5155f, 20.3505f, 3.6495f)
                close()
                moveTo(11.2171f, 15.8784f)
                lineTo(11.9873f, 16.6486f)
                lineTo(14.136f, 14.5f)
                lineTo(13.3657f, 13.7298f)
                curveTo(13.0728f, 13.4369f, 13.0728f, 12.962f, 13.3657f, 12.6691f)
                curveTo(13.6586f, 12.3762f, 14.1335f, 12.3762f, 14.4264f, 12.6691f)
                lineTo(15.1966f, 13.4393f)
                lineTo(17.3354f, 11.3006f)
                lineTo(16.5651f, 10.5303f)
                curveTo(16.2722f, 10.2374f, 16.2722f, 9.7626f, 16.5651f, 9.4697f)
                curveTo(16.858f, 9.1768f, 17.3329f, 9.1768f, 17.6258f, 9.4697f)
                lineTo(18.396f, 10.2399f)
                lineTo(19.2899f, 9.3461f)
                curveTo(20.57f, 8.0659f, 20.57f, 5.9903f, 19.2899f, 4.7101f)
                curveTo(18.0097f, 3.4299f, 15.9341f, 3.4299f, 14.6539f, 4.7101f)
                lineTo(5.7116f, 13.6525f)
                curveTo(5.2237f, 14.1403f, 4.9841f, 14.8235f, 5.0603f, 15.5092f)
                lineTo(5.1491f, 16.3083f)
                curveTo(5.2418f, 17.1429f, 4.9501f, 17.9743f, 4.3564f, 18.568f)
                lineTo(3.9728f, 18.9517f)
                curveTo(3.6758f, 19.2487f, 3.6758f, 19.7302f, 3.9728f, 20.0272f)
                curveTo(4.2698f, 20.3243f, 4.7513f, 20.3243f, 5.0483f, 20.0272f)
                lineTo(5.432f, 19.6436f)
                curveTo(6.0257f, 19.0499f, 6.8571f, 18.7582f, 7.6917f, 18.8509f)
                lineTo(8.4908f, 18.9397f)
                curveTo(9.1765f, 19.0159f, 9.8597f, 18.7763f, 10.3475f, 18.2884f)
                lineTo(10.9267f, 17.7093f)
                lineTo(10.1564f, 16.939f)
                curveTo(9.8636f, 16.6461f, 9.8636f, 16.1713f, 10.1564f, 15.8784f)
                curveTo(10.4493f, 15.5855f, 10.9242f, 15.5855f, 11.2171f, 15.8784f)
                close()
            }
        }
            .build()
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
