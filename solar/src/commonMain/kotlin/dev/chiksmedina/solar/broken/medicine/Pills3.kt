package dev.chiksmedina.solar.broken.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MedicineGroup

val MedicineGroup.Pills3: ImageVector
    get() {
        if (_pills3 != null) {
            return _pills3!!
        }
        _pills3 = Builder(
            name = "Pills3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 9.4724f)
                curveTo(11.0f, 8.3208f, 10.5607f, 7.1691f, 9.682f, 6.2905f)
                curveTo(8.9307f, 5.5391f, 7.9798f, 5.109f, 7.0f, 5.0001f)
                moveTo(11.0f, 9.4724f)
                curveTo(11.0f, 10.6241f, 10.5607f, 11.7757f, 9.682f, 12.6544f)
                curveTo(7.9246f, 14.4118f, 5.0754f, 14.4118f, 3.318f, 12.6544f)
                curveTo(2.4393f, 11.7757f, 2.0f, 10.6241f, 2.0f, 9.4724f)
                moveTo(11.0f, 9.4724f)
                horizontalLineTo(2.0f)
                moveTo(2.0f, 9.4724f)
                curveTo(2.0f, 8.3208f, 2.4393f, 7.1691f, 3.318f, 6.2905f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.7574f, 7.1216f)
                curveTo(15.9289f, 8.2931f, 17.8284f, 8.2931f, 19.0f, 7.1216f)
                curveTo(19.5858f, 6.5358f, 19.8787f, 5.768f, 19.8787f, 5.0002f)
                curveTo(19.8787f, 4.2325f, 19.5858f, 3.4647f, 19.0f, 2.8789f)
                curveTo(17.8284f, 1.7074f, 15.9289f, 1.7074f, 14.7574f, 2.8789f)
                curveTo(14.1716f, 3.4647f, 13.8787f, 4.2325f, 13.8787f, 5.0002f)
                curveTo(13.8787f, 5.768f, 14.1716f, 6.5358f, 14.7574f, 7.1216f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.381f, 20.9052f)
                lineTo(20.9052f, 17.381f)
                curveTo(22.3649f, 15.9213f, 22.3649f, 13.5546f, 20.9052f, 12.0948f)
                curveTo(19.4454f, 10.6351f, 17.0787f, 10.6351f, 15.619f, 12.0948f)
                lineTo(12.0948f, 15.619f)
                curveTo(10.6351f, 17.0787f, 10.6351f, 19.4454f, 12.0948f, 20.9052f)
                curveTo(12.636f, 21.4464f, 13.3019f, 21.7869f, 14.0f, 21.9268f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 14.0f)
                curveTo(14.0f, 14.0f, 14.2813f, 15.4596f, 15.911f, 17.0892f)
                curveTo(17.5407f, 18.7189f, 19.0f, 19.0f, 19.0f, 19.0f)
            }
        }
            .build()
        return _pills3!!
    }

private var _pills3: ImageVector? = null
