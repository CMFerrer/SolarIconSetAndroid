package dev.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.DesignToolsGroup

val DesignToolsGroup.Pallete2: ImageVector
    get() {
        if (_pallete2 != null) {
            return _pallete2!!
        }
        _pallete2 = Builder(
            name = "Pallete2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8932f, 2.75f, 2.75f, 6.9012f, 2.75f, 12.0261f)
                curveTo(2.75f, 16.7885f, 6.3286f, 20.7112f, 10.9326f, 21.2412f)
                curveTo(11.395f, 21.2944f, 11.89f, 21.1004f, 12.2858f, 20.7036f)
                curveTo(12.6473f, 20.3412f, 12.6473f, 19.7528f, 12.2858f, 19.3904f)
                curveTo(11.9739f, 19.0776f, 11.6611f, 18.6609f, 11.4899f, 18.1872f)
                curveTo(11.3146f, 17.702f, 11.2713f, 17.0933f, 11.627f, 16.5276f)
                curveTo(11.9499f, 16.014f, 12.4341f, 15.739f, 12.9421f, 15.6053f)
                curveTo(13.4313f, 15.4766f, 13.9734f, 15.4693f, 14.494f, 15.5009f)
                curveTo(14.978f, 15.5303f, 15.4991f, 15.5978f, 16.0045f, 15.6633f)
                curveTo(16.0471f, 15.6689f, 16.0896f, 15.6744f, 16.132f, 15.6798f)
                curveTo(16.6889f, 15.7517f, 17.2328f, 15.8188f, 17.7581f, 15.8439f)
                curveTo(18.8324f, 15.8954f, 19.6599f, 15.76f, 20.2254f, 15.2976f)
                curveTo(20.7667f, 14.8552f, 21.25f, 13.9568f, 21.25f, 12.0261f)
                curveTo(21.25f, 6.9012f, 17.1068f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0261f)
                curveTo(1.25f, 6.0765f, 6.0611f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9389f, 1.25f, 22.75f, 6.0765f, 22.75f, 12.0261f)
                curveTo(22.75f, 14.1713f, 22.2132f, 15.6101f, 21.1748f, 16.459f)
                curveTo(20.1608f, 17.2879f, 18.8495f, 17.398f, 17.6863f, 17.3422f)
                curveTo(17.0929f, 17.3138f, 16.4934f, 17.239f, 15.9399f, 17.1675f)
                curveTo(15.901f, 17.1625f, 15.8625f, 17.1575f, 15.8241f, 17.1525f)
                curveTo(15.3046f, 17.0853f, 14.8335f, 17.0243f, 14.4032f, 16.9982f)
                curveTo(13.937f, 16.9699f, 13.5828f, 16.9878f, 13.3239f, 17.0559f)
                curveTo(13.0837f, 17.1191f, 12.968f, 17.2127f, 12.8968f, 17.326f)
                curveTo(12.858f, 17.3877f, 12.8307f, 17.4837f, 12.9007f, 17.6775f)
                curveTo(12.9749f, 17.8829f, 13.1368f, 18.1195f, 13.3478f, 18.3311f)
                curveTo(14.2933f, 19.279f, 14.2933f, 20.815f, 13.3478f, 21.7629f)
                curveTo(12.6976f, 22.4148f, 11.7682f, 22.8473f, 10.761f, 22.7314f)
                curveTo(5.4057f, 22.1148f, 1.25f, 17.5562f, 1.25f, 12.0261f)
                close()
                moveTo(9.585f, 6.2498f)
                curveTo(9.1708f, 6.2498f, 8.835f, 6.5856f, 8.835f, 6.9998f)
                curveTo(8.835f, 7.414f, 9.1708f, 7.7498f, 9.585f, 7.7498f)
                curveTo(9.9992f, 7.7498f, 10.335f, 7.414f, 10.335f, 6.9998f)
                curveTo(10.335f, 6.5856f, 9.9992f, 6.2498f, 9.585f, 6.2498f)
                close()
                moveTo(7.335f, 6.9998f)
                curveTo(7.335f, 5.7571f, 8.3424f, 4.7498f, 9.585f, 4.7498f)
                curveTo(10.8276f, 4.7498f, 11.835f, 5.7571f, 11.835f, 6.9998f)
                curveTo(11.835f, 8.2424f, 10.8276f, 9.2498f, 9.585f, 9.2498f)
                curveTo(8.3424f, 9.2498f, 7.335f, 8.2424f, 7.335f, 6.9998f)
                close()
                moveTo(14.5f, 6.25f)
                curveTo(14.0858f, 6.25f, 13.75f, 6.5858f, 13.75f, 7.0f)
                curveTo(13.75f, 7.4142f, 14.0858f, 7.75f, 14.5f, 7.75f)
                curveTo(14.9142f, 7.75f, 15.25f, 7.4142f, 15.25f, 7.0f)
                curveTo(15.25f, 6.5858f, 14.9142f, 6.25f, 14.5f, 6.25f)
                close()
                moveTo(12.25f, 7.0f)
                curveTo(12.25f, 5.7574f, 13.2574f, 4.75f, 14.5f, 4.75f)
                curveTo(15.7426f, 4.75f, 16.75f, 5.7574f, 16.75f, 7.0f)
                curveTo(16.75f, 8.2426f, 15.7426f, 9.25f, 14.5f, 9.25f)
                curveTo(13.2574f, 9.25f, 12.25f, 8.2426f, 12.25f, 7.0f)
                close()
                moveTo(6.5f, 10.75f)
                curveTo(6.0858f, 10.75f, 5.75f, 11.0858f, 5.75f, 11.5f)
                curveTo(5.75f, 11.9142f, 6.0858f, 12.25f, 6.5f, 12.25f)
                curveTo(6.9142f, 12.25f, 7.25f, 11.9142f, 7.25f, 11.5f)
                curveTo(7.25f, 11.0858f, 6.9142f, 10.75f, 6.5f, 10.75f)
                close()
                moveTo(4.25f, 11.5f)
                curveTo(4.25f, 10.2574f, 5.2574f, 9.25f, 6.5f, 9.25f)
                curveTo(7.7426f, 9.25f, 8.75f, 10.2574f, 8.75f, 11.5f)
                curveTo(8.75f, 12.7426f, 7.7426f, 13.75f, 6.5f, 13.75f)
                curveTo(5.2574f, 13.75f, 4.25f, 12.7426f, 4.25f, 11.5f)
                close()
                moveTo(17.5f, 10.75f)
                curveTo(17.0858f, 10.75f, 16.75f, 11.0858f, 16.75f, 11.5f)
                curveTo(16.75f, 11.9142f, 17.0858f, 12.25f, 17.5f, 12.25f)
                curveTo(17.9142f, 12.25f, 18.25f, 11.9142f, 18.25f, 11.5f)
                curveTo(18.25f, 11.0858f, 17.9142f, 10.75f, 17.5f, 10.75f)
                close()
                moveTo(15.25f, 11.5f)
                curveTo(15.25f, 10.2574f, 16.2574f, 9.25f, 17.5f, 9.25f)
                curveTo(18.7426f, 9.25f, 19.75f, 10.2574f, 19.75f, 11.5f)
                curveTo(19.75f, 12.7426f, 18.7426f, 13.75f, 17.5f, 13.75f)
                curveTo(16.2574f, 13.75f, 15.25f, 12.7426f, 15.25f, 11.5f)
                close()
            }
        }
            .build()
        return _pallete2!!
    }

private var _pallete2: ImageVector? = null
