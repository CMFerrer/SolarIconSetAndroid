package dev.chiksmedina.solar.boldduotone.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.WeatherGroup

val WeatherGroup.CloudBolt: ImageVector
    get() {
        if (_cloudBolt != null) {
            return _cloudBolt!!
        }
        _cloudBolt = Builder(
            name = "CloudBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.2857f, 18.0f)
                curveTo(19.4416f, 18.0f, 22.0f, 15.4717f, 22.0f, 12.3529f)
                curveTo(22.0f, 9.8811f, 20.393f, 7.7802f, 18.1551f, 7.015f)
                curveTo(17.8371f, 4.1937f, 15.4159f, 2.0f, 12.4762f, 2.0f)
                curveTo(9.3203f, 2.0f, 6.7619f, 4.5283f, 6.7619f, 7.6471f)
                curveTo(6.7619f, 8.3369f, 6.8871f, 8.9978f, 7.1162f, 9.6089f)
                curveTo(6.8475f, 9.5567f, 6.5698f, 9.5294f, 6.2857f, 9.5294f)
                curveTo(3.9188f, 9.5294f, 2.0f, 11.4256f, 2.0f, 13.7647f)
                curveTo(2.0f, 16.1038f, 3.9188f, 18.0f, 6.2857f, 18.0f)
                horizontalLineTo(16.2857f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.6261f, 17.4651f)
                lineTo(10.7744f, 15.9104f)
                curveTo(11.5166f, 14.9054f, 11.8878f, 14.4029f, 12.234f, 14.5091f)
                curveTo(12.5803f, 14.6153f, 12.5803f, 15.2316f, 12.5803f, 16.4642f)
                verticalLineTo(16.5804f)
                curveTo(12.5803f, 17.025f, 12.5803f, 17.2472f, 12.7222f, 17.3867f)
                lineTo(12.7297f, 17.3939f)
                curveTo(12.8748f, 17.5304f, 13.106f, 17.5304f, 13.5683f, 17.5304f)
                curveTo(14.4004f, 17.5304f, 14.8165f, 17.5304f, 14.9571f, 17.7829f)
                curveTo(14.9594f, 17.7871f, 14.9617f, 17.7913f, 14.9639f, 17.7955f)
                curveTo(15.0966f, 18.052f, 14.8557f, 18.3781f, 14.3739f, 19.0304f)
                lineTo(13.2256f, 20.5851f)
                curveTo(12.4833f, 21.5901f, 12.1122f, 22.0926f, 11.7659f, 21.9864f)
                curveTo(11.4197f, 21.8802f, 11.4197f, 21.2639f, 11.4197f, 20.0313f)
                lineTo(11.4197f, 19.9151f)
                curveTo(11.4197f, 19.4705f, 11.4197f, 19.2483f, 11.2778f, 19.1088f)
                lineTo(11.2703f, 19.1016f)
                curveTo(11.1252f, 18.9651f, 10.894f, 18.9651f, 10.4317f, 18.9651f)
                curveTo(9.5996f, 18.9651f, 9.1835f, 18.9651f, 9.0429f, 18.7126f)
                curveTo(9.0406f, 18.7084f, 9.0384f, 18.7042f, 9.0361f, 18.6999f)
                curveTo(8.9034f, 18.4435f, 9.1443f, 18.1174f, 9.6261f, 17.4651f)
                close()
            }
        }
            .build()
        return _cloudBolt!!
    }

private var _cloudBolt: ImageVector? = null
