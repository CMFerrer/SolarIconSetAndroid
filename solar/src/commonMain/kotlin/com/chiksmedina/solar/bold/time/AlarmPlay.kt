package com.chiksmedina.solar.bold.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TimeGroup

val TimeGroup.AlarmPlay: ImageVector
    get() {
        if (_alarmPlay != null) {
            return _alarmPlay!!
        }
        _alarmPlay = Builder(
            name = "AlarmPlay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0001f)
                curveTo(16.9705f, 22.0001f, 21.0f, 17.9707f, 21.0f, 13.0001f)
                curveTo(21.0f, 8.0295f, 16.9705f, 4.0001f, 12.0f, 4.0001f)
                curveTo(7.0294f, 4.0001f, 3.0f, 8.0295f, 3.0f, 13.0001f)
                curveTo(3.0f, 17.9707f, 7.0294f, 22.0001f, 12.0f, 22.0001f)
                close()
                moveTo(13.0261f, 10.275f)
                curveTo(12.7888f, 10.1084f, 12.5201f, 9.9361f, 12.2419f, 9.7669f)
                curveTo(11.1695f, 9.1148f, 10.6333f, 8.7887f, 10.1524f, 9.1497f)
                curveTo(9.6715f, 9.5107f, 9.6278f, 10.2665f, 9.5404f, 11.7779f)
                curveTo(9.5156f, 12.2054f, 9.5f, 12.6244f, 9.5f, 13.0001f)
                curveTo(9.5f, 13.3758f, 9.5156f, 13.7948f, 9.5404f, 14.2223f)
                curveTo(9.6278f, 15.7337f, 9.6715f, 16.4895f, 10.1524f, 16.8505f)
                curveTo(10.6333f, 17.2115f, 11.1695f, 16.8854f, 12.2419f, 16.2333f)
                curveTo(12.5201f, 16.0641f, 12.7888f, 15.8918f, 13.0261f, 15.7252f)
                curveTo(13.2965f, 15.5353f, 13.5909f, 15.3074f, 13.8876f, 15.0653f)
                curveTo(14.9625f, 14.1884f, 15.5f, 13.75f, 15.5f, 13.0001f)
                curveTo(15.5f, 12.2502f, 14.9625f, 11.8118f, 13.8876f, 10.9349f)
                curveTo(13.5909f, 10.6928f, 13.2965f, 10.4649f, 13.0261f, 10.275f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.136f, 1.6026f)
                curveTo(8.3555f, 1.9539f, 8.2487f, 2.4166f, 7.8975f, 2.6361f)
                lineTo(3.8975f, 5.1361f)
                curveTo(3.5462f, 5.3556f, 3.0835f, 5.2488f, 2.864f, 4.8976f)
                curveTo(2.6444f, 4.5463f, 2.7512f, 4.0836f, 3.1025f, 3.8641f)
                lineTo(7.1025f, 1.3641f)
                curveTo(7.4538f, 1.1446f, 7.9165f, 1.2514f, 8.136f, 1.6026f)
                close()
                moveTo(15.864f, 1.6026f)
                curveTo(16.0835f, 1.2514f, 16.5462f, 1.1446f, 16.8975f, 1.3641f)
                lineTo(20.8975f, 3.8641f)
                curveTo(21.2487f, 4.0836f, 21.3555f, 4.5464f, 21.136f, 4.8976f)
                curveTo(20.9164f, 5.2488f, 20.4537f, 5.3556f, 20.1025f, 5.1361f)
                lineTo(16.1025f, 2.6361f)
                curveTo(15.7512f, 2.4166f, 15.6444f, 1.9539f, 15.864f, 1.6026f)
                close()
            }
        }
            .build()
        return _alarmPlay!!
    }

private var _alarmPlay: ImageVector? = null
