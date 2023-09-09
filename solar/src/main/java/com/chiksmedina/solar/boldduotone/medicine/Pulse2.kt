package com.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.MedicineGroup

public val MedicineGroup.Pulse2: ImageVector
    get() {
        if (_pulse2 != null) {
            return _pulse2!!
        }
        _pulse2 = Builder(name = "Pulse2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 12.8185f, 2.0f, 13.5659f, 2.0077f, 14.25f)
                horizontalLineTo(5.0f)
                lineTo(5.1077f, 14.2499f)
                curveTo(5.6338f, 14.2491f, 6.1007f, 14.2483f, 6.5292f, 14.4319f)
                curveTo(6.9576f, 14.6155f, 7.2791f, 14.9542f, 7.6413f, 15.3357f)
                lineTo(7.7155f, 15.4138f)
                lineTo(8.8571f, 16.6125f)
                curveTo(8.9656f, 16.7264f, 9.1483f, 16.7141f, 9.2406f, 16.5867f)
                lineTo(12.8944f, 11.5435f)
                curveTo(13.0432f, 11.3379f, 13.1985f, 11.1233f, 13.3518f, 10.9653f)
                curveTo(13.5272f, 10.7844f, 13.7992f, 10.5708f, 14.1937f, 10.5527f)
                curveTo(14.5882f, 10.5346f, 14.8787f, 10.7223f, 15.0699f, 10.8863f)
                curveTo(15.2371f, 11.0297f, 15.4114f, 11.229f, 15.5785f, 11.4201f)
                lineTo(17.3823f, 13.4816f)
                curveTo(17.868f, 14.0368f, 17.9718f, 14.1316f, 18.085f, 14.183f)
                curveTo(18.1982f, 14.2343f, 18.3379f, 14.25f, 19.0756f, 14.25f)
                horizontalLineTo(21.9923f)
                curveTo(22.0f, 13.5659f, 22.0f, 12.8185f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0076f, 14.25f)
                curveTo(2.044f, 17.5057f, 2.2542f, 19.3254f, 3.4644f, 20.5356f)
                curveTo(4.9288f, 22.0f, 7.2859f, 22.0f, 11.9999f, 22.0f)
                curveTo(16.7139f, 22.0f, 19.071f, 22.0f, 20.5354f, 20.5356f)
                curveTo(21.7456f, 19.3254f, 21.9558f, 17.5057f, 21.9922f, 14.25f)
                horizontalLineTo(19.0755f)
                curveTo(18.3378f, 14.25f, 18.1981f, 14.2344f, 18.0849f, 14.183f)
                curveTo(17.9717f, 14.1316f, 17.868f, 14.0368f, 17.3822f, 13.4817f)
                lineTo(15.5784f, 11.4202f)
                curveTo(15.4113f, 11.229f, 15.237f, 11.0297f, 15.0698f, 10.8863f)
                curveTo(14.8786f, 10.7223f, 14.5881f, 10.5346f, 14.1936f, 10.5527f)
                curveTo(13.7991f, 10.5709f, 13.5271f, 10.7844f, 13.3518f, 10.9653f)
                curveTo(13.1984f, 11.1234f, 13.0431f, 11.3379f, 12.8943f, 11.5435f)
                lineTo(9.2405f, 16.5868f)
                curveTo(9.1482f, 16.7141f, 8.9655f, 16.7264f, 8.857f, 16.6125f)
                lineTo(7.7154f, 15.4138f)
                lineTo(7.6412f, 15.3357f)
                curveTo(7.279f, 14.9542f, 6.9575f, 14.6156f, 6.5291f, 14.4319f)
                curveTo(6.1007f, 14.2483f, 5.6337f, 14.2491f, 5.1076f, 14.2499f)
                lineTo(4.9999f, 14.25f)
                horizontalLineTo(2.0076f)
                close()
            }
        }
        .build()
        return _pulse2!!
    }

private var _pulse2: ImageVector? = null
