package dev.chiksmedina.solar.lineduotone.maplocation

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
import dev.chiksmedina.solar.lineduotone.MapLocationGroup

val MapLocationGroup.MapPointSchool: ImageVector
    get() {
        if (_mapPointSchool != null) {
            return _mapPointSchool!!
        }
        _mapPointSchool = Builder(
            name = "MapPointSchool", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 10.1433f)
                curveTo(4.0f, 5.6459f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 5.6459f, 20.0f, 10.1433f)
                curveTo(20.0f, 14.6055f, 17.4467f, 19.8124f, 13.4629f, 21.6744f)
                curveTo(12.5343f, 22.1085f, 11.4657f, 22.1085f, 10.5371f, 21.6744f)
                curveTo(6.5533f, 19.8124f, 4.0f, 14.6055f, 4.0f, 10.1433f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.224f, 6.6363f)
                curveTo(11.7213f, 6.4546f, 12.2787f, 6.4546f, 12.776f, 6.6363f)
                lineTo(15.1179f, 7.4918f)
                curveTo(15.6274f, 7.6779f, 15.6274f, 8.3221f, 15.1179f, 8.5082f)
                lineTo(12.776f, 9.3637f)
                curveTo(12.2787f, 9.5454f, 11.7213f, 9.5454f, 11.224f, 9.3637f)
                lineTo(8.8821f, 8.5082f)
                curveTo(8.3727f, 8.3221f, 8.3727f, 7.6779f, 8.8821f, 7.4918f)
                lineTo(11.224f, 6.6363f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 9.0f)
                verticalLineTo(11.7002f)
                curveTo(14.5f, 12.0891f, 14.2746f, 12.4439f, 13.9097f, 12.5785f)
                curveTo(13.3965f, 12.7679f, 12.6375f, 13.0f, 12.0f, 13.0f)
                curveTo(11.3625f, 13.0f, 10.6035f, 12.7679f, 10.0903f, 12.5785f)
                curveTo(9.7254f, 12.4439f, 9.5f, 12.0891f, 9.5f, 11.7002f)
                verticalLineTo(9.0f)
            }
        }
            .build()
        return _mapPointSchool!!
    }

private var _mapPointSchool: ImageVector? = null
