package com.chiksmedina.solar.bold.weather

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
import com.chiksmedina.solar.bold.WeatherGroup

public val WeatherGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0303f, 14.9697f)
                curveTo(12.3232f, 15.2626f, 12.3232f, 15.7374f, 12.0303f, 16.0303f)
                lineTo(10.0303f, 18.0303f)
                curveTo(9.7374f, 18.3232f, 9.2626f, 18.3232f, 8.9697f, 18.0303f)
                curveTo(8.6768f, 17.7374f, 8.6768f, 17.2626f, 8.9697f, 16.9697f)
                lineTo(10.9697f, 14.9697f)
                curveTo(11.2626f, 14.6768f, 11.7374f, 14.6768f, 12.0303f, 14.9697f)
                close()
                moveTo(16.5303f, 14.9697f)
                curveTo(16.8232f, 15.2626f, 16.8232f, 15.7374f, 16.5303f, 16.0303f)
                lineTo(14.5303f, 18.0303f)
                curveTo(14.2374f, 18.3232f, 13.7626f, 18.3232f, 13.4697f, 18.0303f)
                curveTo(13.1768f, 17.7374f, 13.1768f, 17.2626f, 13.4697f, 16.9697f)
                lineTo(15.4697f, 14.9697f)
                curveTo(15.7626f, 14.6768f, 16.2374f, 14.6768f, 16.5303f, 14.9697f)
                close()
                moveTo(8.0303f, 18.4697f)
                curveTo(8.3232f, 18.7626f, 8.3232f, 19.2374f, 8.0303f, 19.5303f)
                lineTo(6.0303f, 21.5303f)
                curveTo(5.7374f, 21.8232f, 5.2626f, 21.8232f, 4.9697f, 21.5303f)
                curveTo(4.6768f, 21.2374f, 4.6768f, 20.7626f, 4.9697f, 20.4697f)
                lineTo(6.9697f, 18.4697f)
                curveTo(7.2626f, 18.1768f, 7.7374f, 18.1768f, 8.0303f, 18.4697f)
                close()
                moveTo(17.5303f, 18.4697f)
                curveTo(17.8232f, 18.7626f, 17.8232f, 19.2374f, 17.5303f, 19.5303f)
                lineTo(15.5303f, 21.5303f)
                curveTo(15.2374f, 21.8232f, 14.7626f, 21.8232f, 14.4697f, 21.5303f)
                curveTo(14.1768f, 21.2374f, 14.1768f, 20.7626f, 14.4697f, 20.4697f)
                lineTo(16.4697f, 18.4697f)
                curveTo(16.7626f, 18.1768f, 17.2374f, 18.1768f, 17.5303f, 18.4697f)
                close()
                moveTo(12.5303f, 19.4697f)
                curveTo(12.8232f, 19.7626f, 12.8232f, 20.2374f, 12.5303f, 20.5303f)
                lineTo(10.5303f, 22.5303f)
                curveTo(10.2374f, 22.8232f, 9.7626f, 22.8232f, 9.4697f, 22.5303f)
                curveTo(9.1768f, 22.2374f, 9.1768f, 21.7626f, 9.4697f, 21.4697f)
                lineTo(11.4697f, 19.4697f)
                curveTo(11.7626f, 19.1768f, 12.2374f, 19.1768f, 12.5303f, 19.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1238f, 18.2554f)
                curveTo(19.0156f, 17.9463f, 18.838f, 17.6561f, 18.591f, 17.409f)
                curveTo(18.3514f, 17.1694f, 18.0712f, 16.9951f, 17.7725f, 16.8862f)
                curveTo(18.4648f, 16.0033f, 18.4043f, 14.7223f, 17.591f, 13.909f)
                curveTo(16.7123f, 13.0303f, 15.2877f, 13.0303f, 14.409f, 13.909f)
                lineTo(13.6075f, 14.7105f)
                curveTo(13.4982f, 14.4182f, 13.326f, 14.1441f, 13.091f, 13.909f)
                curveTo(12.2123f, 13.0303f, 10.7877f, 13.0303f, 9.909f, 13.909f)
                lineTo(7.909f, 15.909f)
                curveTo(7.6625f, 16.1555f, 7.4851f, 16.445f, 7.3769f, 16.7533f)
                curveTo(6.8428f, 16.7824f, 6.317f, 17.001f, 5.909f, 17.409f)
                lineTo(4.6411f, 18.6769f)
                curveTo(3.0903f, 18.0396f, 2.0f, 16.528f, 2.0f, 14.7647f)
                curveTo(2.0f, 12.4256f, 3.9188f, 10.5294f, 6.2857f, 10.5294f)
                curveTo(6.5698f, 10.5294f, 6.8475f, 10.5567f, 7.1162f, 10.6089f)
                curveTo(6.8871f, 9.9978f, 6.7619f, 9.3369f, 6.7619f, 8.6471f)
                curveTo(6.7619f, 5.5283f, 9.3203f, 3.0f, 12.4762f, 3.0f)
                curveTo(15.4159f, 3.0f, 17.8371f, 5.1937f, 18.1551f, 8.015f)
                curveTo(20.393f, 8.7802f, 22.0f, 10.8811f, 22.0f, 13.3529f)
                curveTo(22.0f, 15.4509f, 20.8423f, 17.2817f, 19.1238f, 18.2554f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0303f, 14.9697f)
                curveTo(12.3232f, 15.2626f, 12.3232f, 15.7374f, 12.0303f, 16.0303f)
                lineTo(10.0303f, 18.0303f)
                curveTo(9.9141f, 18.1465f, 9.7693f, 18.2166f, 9.6186f, 18.2406f)
                curveTo(9.3893f, 18.2771f, 9.1464f, 18.207f, 8.9697f, 18.0303f)
                curveTo(8.8793f, 17.9399f, 8.8168f, 17.8322f, 8.7822f, 17.7178f)
                curveTo(8.7286f, 17.5409f, 8.7419f, 17.348f, 8.822f, 17.1789f)
                curveTo(8.8578f, 17.1032f, 8.9071f, 17.0323f, 8.9697f, 16.9697f)
                lineTo(10.9697f, 14.9697f)
                curveTo(11.2626f, 14.6768f, 11.7374f, 14.6768f, 12.0303f, 14.9697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4697f, 14.9697f)
                lineTo(13.4697f, 16.9697f)
                curveTo(13.1768f, 17.2626f, 13.1768f, 17.7374f, 13.4697f, 18.0303f)
                curveTo(13.7626f, 18.3232f, 14.2374f, 18.3232f, 14.5303f, 18.0303f)
                lineTo(16.5303f, 16.0303f)
                curveTo(16.8232f, 15.7374f, 16.8232f, 15.2626f, 16.5303f, 14.9697f)
                curveTo(16.2374f, 14.6768f, 15.7626f, 14.6768f, 15.4697f, 14.9697f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
