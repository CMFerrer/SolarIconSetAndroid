package com.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MoneyGroup

public val MoneyGroup.MoneyBag: ImageVector
    get() {
        if (_moneyBag != null) {
            return _moneyBag!!
        }
        _moneyBag = Builder(name = "MoneyBag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.052f, 1.25f)
                horizontalLineTo(11.948f)
                curveTo(11.0495f, 1.25f, 10.3003f, 1.25f, 9.7055f, 1.3299f)
                curveTo(9.0777f, 1.4143f, 8.5109f, 1.6f, 8.0555f, 2.0555f)
                curveTo(7.6f, 2.5109f, 7.4143f, 3.0777f, 7.3299f, 3.7055f)
                curveTo(7.2726f, 4.1319f, 7.2564f, 5.1515f, 7.2518f, 6.0257f)
                curveTo(5.2295f, 6.0917f, 4.0154f, 6.3278f, 3.1716f, 7.1716f)
                curveTo(2.0f, 8.3432f, 2.0f, 10.2288f, 2.0f, 14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3431f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f)
                curveTo(22.0f, 10.2288f, 22.0f, 8.3432f, 20.8284f, 7.1716f)
                curveTo(19.9846f, 6.3278f, 18.7705f, 6.0917f, 16.7482f, 6.0257f)
                curveTo(16.7436f, 5.1515f, 16.7274f, 4.1319f, 16.6701f, 3.7055f)
                curveTo(16.5857f, 3.0777f, 16.4f, 2.5109f, 15.9445f, 2.0555f)
                curveTo(15.4891f, 1.6f, 14.9223f, 1.4143f, 14.2945f, 1.3299f)
                curveTo(13.6997f, 1.25f, 12.9505f, 1.25f, 12.052f, 1.25f)
                close()
                moveTo(15.2479f, 6.0019f)
                curveTo(15.2434f, 5.1552f, 15.229f, 4.2441f, 15.1835f, 3.9054f)
                curveTo(15.1214f, 3.4439f, 15.0142f, 3.2464f, 14.8839f, 3.1161f)
                curveTo(14.7536f, 2.9858f, 14.5561f, 2.8786f, 14.0946f, 2.8165f)
                curveTo(13.6116f, 2.7516f, 12.964f, 2.75f, 12.0f, 2.75f)
                curveTo(11.036f, 2.75f, 10.3884f, 2.7516f, 9.9054f, 2.8165f)
                curveTo(9.4439f, 2.8786f, 9.2464f, 2.9858f, 9.1161f, 3.1161f)
                curveTo(8.9858f, 3.2464f, 8.8786f, 3.4439f, 8.8165f, 3.9054f)
                curveTo(8.771f, 4.2441f, 8.7566f, 5.1552f, 8.7521f, 6.0019f)
                curveTo(9.1435f, 6.0f, 9.5589f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(14.4412f, 6.0f, 14.8565f, 6.0f, 15.2479f, 6.0019f)
                close()
                moveTo(12.0f, 9.25f)
                curveTo(12.4142f, 9.25f, 12.75f, 9.5858f, 12.75f, 10.0f)
                verticalLineTo(10.0102f)
                curveTo(13.8388f, 10.2845f, 14.75f, 11.143f, 14.75f, 12.3333f)
                curveTo(14.75f, 12.7475f, 14.4142f, 13.0833f, 14.0f, 13.0833f)
                curveTo(13.5858f, 13.0833f, 13.25f, 12.7475f, 13.25f, 12.3333f)
                curveTo(13.25f, 11.9493f, 12.8242f, 11.4167f, 12.0f, 11.4167f)
                curveTo(11.1758f, 11.4167f, 10.75f, 11.9493f, 10.75f, 12.3333f)
                curveTo(10.75f, 12.7174f, 11.1758f, 13.25f, 12.0f, 13.25f)
                curveTo(13.3849f, 13.25f, 14.75f, 14.2098f, 14.75f, 15.6667f)
                curveTo(14.75f, 16.857f, 13.8388f, 17.7155f, 12.75f, 17.9898f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.4142f, 12.4142f, 18.75f, 12.0f, 18.75f)
                curveTo(11.5858f, 18.75f, 11.25f, 18.4142f, 11.25f, 18.0f)
                verticalLineTo(17.9898f)
                curveTo(10.1612f, 17.7155f, 9.25f, 16.857f, 9.25f, 15.6667f)
                curveTo(9.25f, 15.2525f, 9.5858f, 14.9167f, 10.0f, 14.9167f)
                curveTo(10.4142f, 14.9167f, 10.75f, 15.2525f, 10.75f, 15.6667f)
                curveTo(10.75f, 16.0507f, 11.1758f, 16.5833f, 12.0f, 16.5833f)
                curveTo(12.8242f, 16.5833f, 13.25f, 16.0507f, 13.25f, 15.6667f)
                curveTo(13.25f, 15.2826f, 12.8242f, 14.75f, 12.0f, 14.75f)
                curveTo(10.6151f, 14.75f, 9.25f, 13.7903f, 9.25f, 12.3333f)
                curveTo(9.25f, 11.143f, 10.1612f, 10.2845f, 11.25f, 10.0102f)
                verticalLineTo(10.0f)
                curveTo(11.25f, 9.5858f, 11.5858f, 9.25f, 12.0f, 9.25f)
                close()
            }
        }
        .build()
        return _moneyBag!!
    }

private var _moneyBag: ImageVector? = null
