package com.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.outline.MedicineGroup

public val MedicineGroup.Health: ImageVector
    get() {
        if (_health != null) {
            return _health!!
        }
        _health = Builder(name = "Health", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.25f, 7.0f)
                curveTo(17.25f, 6.5858f, 16.9142f, 6.25f, 16.5f, 6.25f)
                curveTo(16.0858f, 6.25f, 15.75f, 6.5858f, 15.75f, 7.0f)
                verticalLineTo(8.2501f)
                horizontalLineTo(14.5f)
                curveTo(14.0858f, 8.2501f, 13.75f, 8.5858f, 13.75f, 9.0001f)
                curveTo(13.75f, 9.4143f, 14.0858f, 9.7501f, 14.5f, 9.7501f)
                lineTo(15.75f, 9.7501f)
                verticalLineTo(11.0f)
                curveTo(15.75f, 11.4143f, 16.0858f, 11.75f, 16.5f, 11.75f)
                curveTo(16.9142f, 11.75f, 17.25f, 11.4143f, 17.25f, 11.0f)
                verticalLineTo(9.7501f)
                horizontalLineTo(18.5f)
                curveTo(18.9142f, 9.7501f, 19.25f, 9.4143f, 19.25f, 9.0001f)
                curveTo(19.25f, 8.5858f, 18.9142f, 8.2501f, 18.5f, 8.2501f)
                horizontalLineTo(17.25f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.75f, 9.3175f)
                curveTo(22.75f, 5.9921f, 21.2676f, 3.5097f, 18.9609f, 2.6065f)
                curveTo(16.8252f, 1.7702f, 14.2618f, 2.3959f, 12.0f, 4.5132f)
                curveTo(9.7381f, 2.3959f, 7.1748f, 1.7702f, 5.0391f, 2.6065f)
                curveTo(2.7324f, 3.5097f, 1.25f, 5.9921f, 1.25f, 9.3175f)
                curveTo(1.25f, 11.4354f, 2.3804f, 13.5196f, 3.7873f, 15.314f)
                curveTo(5.2086f, 17.1268f, 6.9967f, 18.75f, 8.4891f, 19.9611f)
                lineTo(8.6233f, 20.07f)
                curveTo(9.8239f, 21.0457f, 10.6906f, 21.75f, 12.0f, 21.75f)
                curveTo(13.3094f, 21.75f, 14.1762f, 21.0457f, 15.3767f, 20.07f)
                lineTo(15.5109f, 19.9611f)
                curveTo(17.0033f, 18.75f, 18.7914f, 17.1268f, 20.2127f, 15.314f)
                curveTo(21.6196f, 13.5197f, 22.75f, 11.4354f, 22.75f, 9.3175f)
                close()
                moveTo(12.5478f, 6.0864f)
                curveTo(14.6596f, 3.8278f, 16.8491f, 3.3905f, 18.414f, 4.0032f)
                curveTo(19.9823f, 4.6173f, 21.25f, 6.4129f, 21.25f, 9.3175f)
                curveTo(21.25f, 10.9289f, 20.3707f, 12.6815f, 19.0323f, 14.3885f)
                curveTo(17.7084f, 16.077f, 16.0156f, 17.6198f, 14.5657f, 18.7963f)
                curveTo(13.1731f, 19.9264f, 12.7229f, 20.25f, 12.0f, 20.25f)
                curveTo(11.2771f, 20.25f, 10.8269f, 19.9264f, 9.4343f, 18.7963f)
                curveTo(7.9844f, 17.6197f, 6.2917f, 16.077f, 4.9677f, 14.3884f)
                curveTo(3.6293f, 12.6814f, 2.75f, 10.9289f, 2.75f, 9.3175f)
                curveTo(2.75f, 6.4129f, 4.0177f, 4.6174f, 5.586f, 4.0032f)
                curveTo(7.1509f, 3.3905f, 9.3404f, 3.8278f, 11.4522f, 6.0864f)
                curveTo(11.594f, 6.2381f, 11.7923f, 6.3242f, 12.0f, 6.3242f)
                curveTo(12.2077f, 6.3242f, 12.406f, 6.2381f, 12.5478f, 6.0864f)
                close()
            }
        }
        .build()
        return _health!!
    }

private var _health: ImageVector? = null
