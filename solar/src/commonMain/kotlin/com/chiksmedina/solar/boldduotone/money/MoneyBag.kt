package com.chiksmedina.solar.boldduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MoneyGroup

val MoneyGroup.MoneyBag: ImageVector
    get() {
        if (_moneyBag != null) {
            return _moneyBag!!
        }
        _moneyBag = Builder(
            name = "MoneyBag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.1716f, 7.1716f)
                curveTo(4.0154f, 6.3278f, 5.2295f, 6.0917f, 7.2518f, 6.0257f)
                lineTo(8.7521f, 6.0019f)
                curveTo(9.1435f, 6.0f, 9.5589f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(14.4412f, 6.0f, 14.8565f, 6.0f, 15.2479f, 6.0019f)
                lineTo(16.7482f, 6.0257f)
                curveTo(18.7705f, 6.0917f, 19.9846f, 6.3278f, 20.8284f, 7.1716f)
                curveTo(22.0f, 8.3432f, 22.0f, 10.2288f, 22.0f, 14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3431f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                curveTo(2.0f, 10.2288f, 2.0f, 8.3432f, 3.1716f, 7.1716f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 10.0f)
                curveTo(12.75f, 9.5858f, 12.4142f, 9.25f, 12.0f, 9.25f)
                curveTo(11.5858f, 9.25f, 11.25f, 9.5858f, 11.25f, 10.0f)
                verticalLineTo(10.0102f)
                curveTo(10.1612f, 10.2845f, 9.25f, 11.143f, 9.25f, 12.3333f)
                curveTo(9.25f, 13.7903f, 10.6151f, 14.75f, 12.0f, 14.75f)
                curveTo(12.8242f, 14.75f, 13.25f, 15.2826f, 13.25f, 15.6667f)
                curveTo(13.25f, 16.0507f, 12.8242f, 16.5833f, 12.0f, 16.5833f)
                curveTo(11.1758f, 16.5833f, 10.75f, 16.0507f, 10.75f, 15.6667f)
                curveTo(10.75f, 15.2525f, 10.4142f, 14.9167f, 10.0f, 14.9167f)
                curveTo(9.5858f, 14.9167f, 9.25f, 15.2525f, 9.25f, 15.6667f)
                curveTo(9.25f, 16.857f, 10.1612f, 17.7155f, 11.25f, 17.9898f)
                verticalLineTo(18.0f)
                curveTo(11.25f, 18.4142f, 11.5858f, 18.75f, 12.0f, 18.75f)
                curveTo(12.4142f, 18.75f, 12.75f, 18.4142f, 12.75f, 18.0f)
                verticalLineTo(17.9898f)
                curveTo(13.8388f, 17.7155f, 14.75f, 16.857f, 14.75f, 15.6667f)
                curveTo(14.75f, 14.2097f, 13.3849f, 13.25f, 12.0f, 13.25f)
                curveTo(11.1758f, 13.25f, 10.75f, 12.7174f, 10.75f, 12.3333f)
                curveTo(10.75f, 11.9493f, 11.1758f, 11.4167f, 12.0f, 11.4167f)
                curveTo(12.8242f, 11.4167f, 13.25f, 11.9493f, 13.25f, 12.3333f)
                curveTo(13.25f, 12.7475f, 13.5858f, 13.0833f, 14.0f, 13.0833f)
                curveTo(14.4142f, 13.0833f, 14.75f, 12.7475f, 14.75f, 12.3333f)
                curveTo(14.75f, 11.143f, 13.8388f, 10.2845f, 12.75f, 10.0102f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0522f, 1.25f)
                horizontalLineTo(11.9482f)
                curveTo(11.0497f, 1.25f, 10.3005f, 1.25f, 9.7057f, 1.3299f)
                curveTo(9.0779f, 1.4143f, 8.5111f, 1.6f, 8.0556f, 2.0555f)
                curveTo(7.6002f, 2.5109f, 7.4145f, 3.0777f, 7.3301f, 3.7055f)
                curveTo(7.2727f, 4.1319f, 7.2565f, 5.1515f, 7.2519f, 6.0257f)
                lineTo(8.7522f, 6.0019f)
                curveTo(8.7568f, 5.1552f, 8.7712f, 4.2441f, 8.8167f, 3.9054f)
                curveTo(8.8787f, 3.4439f, 8.986f, 3.2464f, 9.1163f, 3.1161f)
                curveTo(9.2466f, 2.9858f, 9.4441f, 2.8786f, 9.9056f, 2.8165f)
                curveTo(10.3886f, 2.7516f, 11.0362f, 2.75f, 12.0002f, 2.75f)
                curveTo(12.9642f, 2.75f, 13.6117f, 2.7516f, 14.0948f, 2.8165f)
                curveTo(14.5562f, 2.8786f, 14.7537f, 2.9858f, 14.884f, 3.1161f)
                curveTo(15.0144f, 3.2464f, 15.1216f, 3.4439f, 15.1836f, 3.9054f)
                curveTo(15.2292f, 4.2441f, 15.2436f, 5.1552f, 15.2481f, 6.0019f)
                lineTo(16.7484f, 6.0257f)
                curveTo(16.7438f, 5.1515f, 16.7276f, 4.1319f, 16.6702f, 3.7055f)
                curveTo(16.5858f, 3.0777f, 16.4002f, 2.5109f, 15.9447f, 2.0555f)
                curveTo(15.4892f, 1.6f, 14.9224f, 1.4143f, 14.2946f, 1.3299f)
                curveTo(13.6999f, 1.25f, 12.9506f, 1.25f, 12.0522f, 1.25f)
                close()
            }
        }
            .build()
        return _moneyBag!!
    }

private var _moneyBag: ImageVector? = null
