package dev.chiksmedina.solar.bold.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.NotesGroup

val NotesGroup.NotesMinimalistic: ImageVector
    get() {
        if (_notesMinimalistic != null) {
            return _notesMinimalistic!!
        }
        _notesMinimalistic = Builder(
            name = "NotesMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0616f, 12.6473f)
                lineTo(20.5793f, 10.7154f)
                curveTo(21.1835f, 8.4603f, 21.4856f, 7.3328f, 21.2581f, 6.357f)
                curveTo(21.0785f, 5.5866f, 20.6744f, 4.8867f, 20.097f, 4.3459f)
                curveTo(19.3657f, 3.6609f, 18.2381f, 3.3588f, 15.9831f, 2.7546f)
                curveTo(13.728f, 2.1503f, 12.6004f, 1.8482f, 11.6247f, 2.0757f)
                curveTo(10.8542f, 2.2554f, 10.1543f, 2.6595f, 9.6135f, 3.2369f)
                curveTo(9.0271f, 3.863f, 8.7213f, 4.7796f, 8.2662f, 6.4456f)
                curveTo(8.1898f, 6.7254f, 8.1091f, 7.0263f, 8.0223f, 7.3506f)
                lineTo(8.0222f, 7.3508f)
                lineTo(7.5046f, 9.2826f)
                curveTo(6.9003f, 11.5377f, 6.5982f, 12.6652f, 6.8257f, 13.641f)
                curveTo(7.0054f, 14.4115f, 7.4095f, 15.1114f, 7.9869f, 15.6522f)
                curveTo(8.7182f, 16.3371f, 9.8457f, 16.6392f, 12.1008f, 17.2435f)
                lineTo(12.1008f, 17.2435f)
                curveTo(14.1334f, 17.7881f, 15.2499f, 18.0873f, 16.165f, 17.9744f)
                curveTo(16.2652f, 17.9621f, 16.3629f, 17.9448f, 16.4592f, 17.9223f)
                curveTo(17.2296f, 17.7427f, 17.9295f, 17.3386f, 18.4703f, 16.7612f)
                curveTo(19.1552f, 16.0299f, 19.4574f, 14.9024f, 20.0616f, 12.6473f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.5046f, 14.715f)
                lineTo(3.0222f, 16.6469f)
                curveTo(3.6265f, 18.902f, 3.9286f, 20.0295f, 4.6135f, 20.7608f)
                curveTo(5.1543f, 21.3382f, 5.8542f, 21.7423f, 6.6247f, 21.9219f)
                curveTo(7.6004f, 22.1494f, 8.728f, 21.8473f, 10.9831f, 21.2431f)
                curveTo(13.2381f, 20.6388f, 14.3657f, 20.3367f, 15.097f, 19.6518f)
                curveTo(15.1577f, 19.5949f, 15.2164f, 19.5363f, 15.2733f, 19.4761f)
                curveTo(14.9391f, 19.448f, 14.602f, 19.3942f, 14.2594f, 19.3261f)
                curveTo(13.5633f, 19.1877f, 12.7362f, 18.9661f, 11.758f, 18.704f)
                lineTo(11.6512f, 18.6753f)
                lineTo(11.6264f, 18.6687f)
                curveTo(10.5621f, 18.3835f, 9.6728f, 18.1448f, 8.9628f, 17.8883f)
                curveTo(8.2161f, 17.6185f, 7.5376f, 17.286f, 6.9615f, 16.7464f)
                curveTo(6.1675f, 16.0028f, 5.6119f, 15.0404f, 5.3649f, 13.9811f)
                curveTo(5.1857f, 13.2123f, 5.2369f, 12.4585f, 5.3767f, 11.6769f)
                curveTo(5.5106f, 10.928f, 5.7511f, 10.0305f, 6.0393f, 8.9551f)
                lineTo(6.0393f, 8.9551f)
                lineTo(6.5736f, 6.9608f)
                lineTo(6.5925f, 6.8906f)
                curveTo(4.6719f, 7.408f, 3.661f, 7.7141f, 2.9869f, 8.3455f)
                curveTo(2.4095f, 8.8863f, 2.0054f, 9.5862f, 1.8257f, 10.3566f)
                curveTo(1.5982f, 11.3324f, 1.9003f, 12.4599f, 2.5046f, 14.715f)
                close()
            }
        }
            .build()
        return _notesMinimalistic!!
    }

private var _notesMinimalistic: ImageVector? = null
