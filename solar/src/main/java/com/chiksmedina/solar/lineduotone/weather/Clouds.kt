package com.chiksmedina.solar.lineduotone.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.WeatherGroup

public val WeatherGroup.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(name = "Clouds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.3529f)
                curveTo(22.0f, 9.8811f, 20.393f, 7.7802f, 18.1551f, 7.015f)
                moveTo(6.2857f, 18.0f)
                curveTo(3.9188f, 18.0f, 2.0f, 16.1038f, 2.0f, 13.7647f)
                curveTo(2.0f, 11.4256f, 3.9188f, 9.5294f, 6.2857f, 9.5294f)
                curveTo(6.5698f, 9.5294f, 6.8475f, 9.5567f, 7.1162f, 9.6089f)
                moveTo(14.381f, 7.0272f)
                curveTo(14.9767f, 6.8191f, 15.6178f, 6.7059f, 16.2857f, 6.7059f)
                curveTo(16.9404f, 6.7059f, 17.5693f, 6.8147f, 18.1551f, 7.015f)
                moveTo(7.1162f, 9.6089f)
                curveTo(6.8871f, 8.9978f, 6.7619f, 8.3369f, 6.7619f, 7.6471f)
                curveTo(6.7619f, 4.5283f, 9.3203f, 2.0f, 12.4762f, 2.0f)
                curveTo(15.4159f, 2.0f, 17.8371f, 4.1937f, 18.1551f, 7.015f)
                moveTo(7.1162f, 9.6089f)
                curveTo(7.6806f, 9.7184f, 8.2053f, 9.9374f, 8.6667f, 10.2426f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0476f, 15.142f)
                curveTo(17.4349f, 15.0119f, 17.8516f, 14.9412f, 18.2857f, 14.9412f)
                curveTo(18.7113f, 14.9412f, 19.1201f, 15.0092f, 19.5008f, 15.1344f)
                moveTo(12.3255f, 16.7555f)
                curveTo(12.1509f, 16.723f, 11.9704f, 16.7059f, 11.7857f, 16.7059f)
                curveTo(10.2472f, 16.7059f, 9.0f, 17.891f, 9.0f, 19.3529f)
                curveTo(9.0f, 20.8149f, 10.2472f, 22.0f, 11.7857f, 22.0f)
                horizontalLineTo(18.2857f)
                curveTo(20.3371f, 22.0f, 22.0f, 20.4198f, 22.0f, 18.4706f)
                curveTo(22.0f, 16.9257f, 20.9554f, 15.6126f, 19.5008f, 15.1344f)
                moveTo(12.3255f, 16.7555f)
                curveTo(12.1766f, 16.3736f, 12.0952f, 15.9605f, 12.0952f, 15.5294f)
                curveTo(12.0952f, 13.5802f, 13.7582f, 12.0f, 15.8095f, 12.0f)
                curveTo(17.7203f, 12.0f, 19.2941f, 13.3711f, 19.5008f, 15.1344f)
                moveTo(12.3255f, 16.7555f)
                curveTo(12.6924f, 16.824f, 13.0334f, 16.9609f, 13.3333f, 17.1516f)
            }
        }
        .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null
