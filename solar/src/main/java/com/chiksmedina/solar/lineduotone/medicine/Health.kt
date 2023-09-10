package com.chiksmedina.solar.lineduotone.medicine

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
import com.chiksmedina.solar.lineduotone.MedicineGroup

val MedicineGroup.Health: ImageVector
    get() {
        if (_health != null) {
            return _health!!
        }
        _health = Builder(
            name = "Health", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.9617f, 19.3786f)
                lineTo(8.4891f, 19.961f)
                lineTo(8.9617f, 19.3786f)
                close()
                moveTo(12.0f, 5.5741f)
                lineTo(11.4522f, 6.0863f)
                curveTo(11.594f, 6.238f, 11.7923f, 6.3241f, 12.0f, 6.3241f)
                curveTo(12.2077f, 6.3241f, 12.406f, 6.238f, 12.5478f, 6.0863f)
                lineTo(12.0f, 5.5741f)
                close()
                moveTo(15.0383f, 19.3787f)
                lineTo(15.5109f, 19.961f)
                lineTo(15.5109f, 19.961f)
                lineTo(15.0383f, 19.3787f)
                close()
                moveTo(12.0f, 21.0f)
                lineTo(12.0f, 20.25f)
                lineTo(12.0f, 21.0f)
                close()
                moveTo(9.4343f, 18.7963f)
                curveTo(7.9844f, 17.6197f, 6.2917f, 16.077f, 4.9677f, 14.3884f)
                curveTo(3.6293f, 12.6814f, 2.75f, 10.9289f, 2.75f, 9.3175f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 11.4354f, 2.3804f, 13.5196f, 3.7873f, 15.3139f)
                curveTo(5.2086f, 17.1267f, 6.9967f, 18.7499f, 8.4891f, 19.961f)
                lineTo(9.4343f, 18.7963f)
                close()
                moveTo(2.75f, 9.3175f)
                curveTo(2.75f, 6.4129f, 4.0177f, 4.6173f, 5.586f, 4.0032f)
                curveTo(7.1509f, 3.3904f, 9.3404f, 3.8278f, 11.4522f, 6.0863f)
                lineTo(12.5478f, 5.0619f)
                curveTo(10.1598f, 2.5078f, 7.3492f, 1.7019f, 5.0391f, 2.6065f)
                curveTo(2.7324f, 3.5097f, 1.25f, 5.9921f, 1.25f, 9.3175f)
                horizontalLineTo(2.75f)
                close()
                moveTo(15.5109f, 19.961f)
                curveTo(17.0033f, 18.7499f, 18.7914f, 17.1268f, 20.2127f, 15.314f)
                curveTo(21.6196f, 13.5196f, 22.75f, 11.4354f, 22.75f, 9.3175f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 10.9289f, 20.3707f, 12.6814f, 19.0323f, 14.3884f)
                curveTo(17.7084f, 16.077f, 16.0156f, 17.6197f, 14.5657f, 18.7963f)
                lineTo(15.5109f, 19.961f)
                close()
                moveTo(22.75f, 9.3175f)
                curveTo(22.75f, 5.9921f, 21.2676f, 3.5097f, 18.9609f, 2.6065f)
                curveTo(16.6508f, 1.7019f, 13.8402f, 2.5078f, 11.4522f, 5.0619f)
                lineTo(12.5478f, 6.0863f)
                curveTo(14.6596f, 3.8278f, 16.8491f, 3.3904f, 18.414f, 4.0032f)
                curveTo(19.9823f, 4.6173f, 21.25f, 6.4129f, 21.25f, 9.3175f)
                horizontalLineTo(22.75f)
                close()
                moveTo(8.4891f, 19.961f)
                curveTo(9.7606f, 20.9928f, 10.6423f, 21.75f, 12.0f, 21.75f)
                lineTo(12.0f, 20.25f)
                curveTo(11.2771f, 20.25f, 10.8269f, 19.9263f, 9.4343f, 18.7963f)
                lineTo(8.4891f, 19.961f)
                close()
                moveTo(14.5657f, 18.7963f)
                curveTo(13.1731f, 19.9263f, 12.7229f, 20.25f, 12.0f, 20.25f)
                lineTo(12.0f, 21.75f)
                curveTo(13.3577f, 21.75f, 14.2394f, 20.9928f, 15.5109f, 19.961f)
                lineTo(14.5657f, 18.7963f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.5f, 9.0f)
                horizontalLineTo(16.5f)
                moveTo(16.5f, 9.0f)
                lineTo(14.5f, 9.0f)
                moveTo(16.5f, 9.0f)
                lineTo(16.5f, 7.0f)
                moveTo(16.5f, 9.0f)
                lineTo(16.5f, 11.0f)
            }
        }
            .build()
        return _health!!
    }

private var _health: ImageVector? = null
