package dev.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(
            name = "Planet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 4.75f)
                curveTo(7.9959f, 4.75f, 4.75f, 7.9959f, 4.75f, 12.0f)
                curveTo(4.75f, 13.9048f, 5.4846f, 15.638f, 6.6859f, 16.9318f)
                curveTo(8.6279f, 16.4835f, 11.0216f, 15.5733f, 13.4783f, 14.2645f)
                curveTo(15.7717f, 13.0425f, 17.7079f, 11.6928f, 19.0825f, 10.4435f)
                curveTo(18.3702f, 7.1875f, 15.4698f, 4.75f, 12.0f, 4.75f)
                close()
                moveTo(19.2447f, 12.281f)
                curveTo(17.8628f, 13.4073f, 16.1329f, 14.5497f, 14.1836f, 15.5883f)
                curveTo(12.0622f, 16.7185f, 9.9585f, 17.5778f, 8.1004f, 18.113f)
                curveTo(9.2264f, 18.8328f, 10.5645f, 19.25f, 12.0f, 19.25f)
                curveTo(15.91f, 19.25f, 19.097f, 16.1548f, 19.2447f, 12.281f)
                close()
                moveTo(6.2103f, 18.5608f)
                curveTo(7.753f, 19.9232f, 9.78f, 20.75f, 12.0f, 20.75f)
                curveTo(16.8325f, 20.75f, 20.75f, 16.8325f, 20.75f, 12.0f)
                curveTo(20.75f, 11.6555f, 20.7301f, 11.3157f, 20.6914f, 10.9815f)
                curveTo(20.7214f, 10.9514f, 20.7512f, 10.9213f, 20.7806f, 10.8912f)
                curveTo(21.5345f, 10.1218f, 22.1235f, 9.3507f, 22.4527f, 8.6231f)
                curveTo(22.7767f, 7.907f, 22.9112f, 7.0788f, 22.465f, 6.3655f)
                curveTo(22.0451f, 5.6944f, 21.2797f, 5.4041f, 20.5094f, 5.3007f)
                curveTo(19.7379f, 5.1971f, 18.8066f, 5.2568f, 17.7897f, 5.4392f)
                curveTo(16.247f, 4.0768f, 14.2201f, 3.25f, 12.0f, 3.25f)
                curveTo(7.1675f, 3.25f, 3.25f, 7.1675f, 3.25f, 12.0f)
                curveTo(3.25f, 12.3445f, 3.2699f, 12.6843f, 3.3086f, 13.0185f)
                curveTo(2.5495f, 13.78f, 1.9542f, 14.5396f, 1.6046f, 15.2551f)
                curveTo(1.2386f, 16.0043f, 1.0642f, 16.882f, 1.535f, 17.6345f)
                curveTo(1.9678f, 18.3262f, 2.7673f, 18.614f, 3.5675f, 18.709f)
                curveTo(4.3212f, 18.7986f, 5.2239f, 18.7377f, 6.2103f, 18.5608f)
                close()
                moveTo(4.9753f, 17.2178f)
                curveTo(4.4342f, 16.4905f, 4.0033f, 15.6762f, 3.7075f, 14.7999f)
                curveTo(3.3645f, 15.2104f, 3.1128f, 15.5852f, 2.9524f, 15.9136f)
                curveTo(2.6751f, 16.481f, 2.7442f, 16.7391f, 2.8067f, 16.8389f)
                curveTo(2.8795f, 16.9553f, 3.1117f, 17.1443f, 3.7444f, 17.2195f)
                curveTo(4.0866f, 17.2602f, 4.4992f, 17.2608f, 4.9753f, 17.2178f)
                close()
                moveTo(19.0247f, 6.7822f)
                curveTo(19.5275f, 6.7368f, 19.9584f, 6.7401f, 20.3097f, 6.7873f)
                curveTo(20.9042f, 6.8672f, 21.1231f, 7.0488f, 21.1933f, 7.1611f)
                curveTo(21.2527f, 7.2559f, 21.3188f, 7.4905f, 21.0861f, 8.0047f)
                curveTo(20.9301f, 8.3495f, 20.6665f, 8.7525f, 20.2925f, 9.2001f)
                curveTo(19.9967f, 8.3237f, 19.5658f, 7.5095f, 19.0247f, 6.7822f)
                close()
            }
        }
            .build()
        return _planet!!
    }

private var _planet: ImageVector? = null
