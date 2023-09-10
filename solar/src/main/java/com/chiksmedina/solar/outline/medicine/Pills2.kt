package com.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.Pills2: ImageVector
    get() {
        if (_pills2 != null) {
            return _pills2!!
        }
        _pills2 = Builder(
            name = "Pills2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.0f, 1.25f)
                curveTo(6.4124f, 1.25f, 4.9739f, 1.8944f, 3.9341f, 2.9341f)
                curveTo(2.8944f, 3.9739f, 2.25f, 5.4124f, 2.25f, 7.0f)
                curveTo(2.25f, 10.1756f, 4.8244f, 12.75f, 8.0f, 12.75f)
                curveTo(9.5876f, 12.75f, 11.0261f, 12.1056f, 12.0659f, 11.0659f)
                curveTo(13.1056f, 10.0261f, 13.75f, 8.5876f, 13.75f, 7.0f)
                curveTo(13.75f, 3.8244f, 11.1756f, 1.25f, 8.0f, 1.25f)
                close()
                moveTo(11.4887f, 9.4281f)
                lineTo(5.5719f, 3.5113f)
                curveTo(6.2604f, 3.0311f, 7.097f, 2.75f, 8.0f, 2.75f)
                curveTo(10.3472f, 2.75f, 12.25f, 4.6528f, 12.25f, 7.0f)
                curveTo(12.25f, 7.903f, 11.9689f, 8.7396f, 11.4887f, 9.4281f)
                close()
                moveTo(4.5113f, 4.5719f)
                lineTo(10.428f, 10.4887f)
                curveTo(9.7396f, 10.9689f, 8.903f, 11.25f, 8.0f, 11.25f)
                curveTo(5.6528f, 11.25f, 3.75f, 9.3472f, 3.75f, 7.0f)
                curveTo(3.75f, 6.097f, 4.0311f, 5.2604f, 4.5113f, 4.5719f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.0659f, 12.9341f)
                curveTo(18.8203f, 10.6886f, 15.1797f, 10.6886f, 12.9341f, 12.9341f)
                curveTo(11.8115f, 14.0567f, 11.25f, 15.5296f, 11.25f, 17.0f)
                curveTo(11.25f, 18.4704f, 11.8115f, 19.9433f, 12.9341f, 21.0659f)
                curveTo(15.1797f, 23.3114f, 18.8203f, 23.3114f, 21.0659f, 21.0659f)
                curveTo(22.1885f, 19.9433f, 22.75f, 18.4704f, 22.75f, 17.0f)
                curveTo(22.75f, 15.5296f, 22.1885f, 14.0567f, 21.0659f, 12.9341f)
                close()
                moveTo(13.9948f, 13.9948f)
                curveTo(15.6545f, 12.3351f, 18.3455f, 12.3351f, 20.0052f, 13.9948f)
                curveTo(20.6437f, 14.6333f, 21.0365f, 15.4236f, 21.1838f, 16.25f)
                horizontalLineTo(12.8162f)
                curveTo(12.9635f, 15.4236f, 13.3563f, 14.6333f, 13.9948f, 13.9948f)
                close()
                moveTo(12.8162f, 17.75f)
                horizontalLineTo(21.1838f)
                curveTo(21.0365f, 18.5764f, 20.6437f, 19.3667f, 20.0052f, 20.0052f)
                curveTo(18.3455f, 21.6649f, 15.6545f, 21.6649f, 13.9948f, 20.0052f)
                curveTo(13.3563f, 19.3667f, 12.9635f, 18.5764f, 12.8162f, 17.75f)
                close()
            }
        }
            .build()
        return _pills2!!
    }

private var _pills2: ImageVector? = null
