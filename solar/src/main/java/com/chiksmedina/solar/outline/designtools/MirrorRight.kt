package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

public val DesignToolsGroup.MirrorRight: ImageVector
    get() {
        if (_mirrorRight != null) {
            return _mirrorRight!!
        }
        _mirrorRight = Builder(name = "MirrorRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 3.75f)
                curveTo(8.5638f, 3.75f, 8.1653f, 3.75f, 7.7976f, 3.7532f)
                curveTo(7.3834f, 3.7568f, 7.0447f, 3.4239f, 7.0411f, 3.0097f)
                curveTo(7.0375f, 2.5955f, 7.3704f, 2.2568f, 7.7846f, 2.2532f)
                curveTo(8.1595f, 2.25f, 8.564f, 2.25f, 8.9979f, 2.25f)
                lineTo(9.9091f, 2.25f)
                curveTo(10.3233f, 2.25f, 10.6591f, 2.5858f, 10.6591f, 3.0f)
                curveTo(10.6591f, 3.4142f, 10.3233f, 3.75f, 9.9091f, 3.75f)
                lineTo(9.0f, 3.75f)
                close()
                moveTo(5.6288f, 3.0546f)
                curveTo(5.7517f, 3.4502f, 5.5307f, 3.8705f, 5.1352f, 3.9934f)
                curveTo(4.814f, 4.0932f, 4.5905f, 4.2275f, 4.409f, 4.409f)
                curveTo(4.2275f, 4.5905f, 4.0932f, 4.814f, 3.9934f, 5.1352f)
                curveTo(3.8705f, 5.5307f, 3.4502f, 5.7517f, 3.0546f, 5.6288f)
                curveTo(2.659f, 5.5059f, 2.4381f, 5.0856f, 2.561f, 4.69f)
                curveTo(2.7212f, 4.1746f, 2.9688f, 3.7279f, 3.3484f, 3.3484f)
                curveTo(3.7279f, 2.9688f, 4.1746f, 2.7212f, 4.69f, 2.561f)
                curveTo(5.0856f, 2.4381f, 5.5059f, 2.659f, 5.6288f, 3.0546f)
                close()
                moveTo(3.0097f, 7.0411f)
                curveTo(3.4239f, 7.0447f, 3.7568f, 7.3834f, 3.7532f, 7.7976f)
                curveTo(3.75f, 8.1653f, 3.75f, 8.5638f, 3.75f, 9.0f)
                lineTo(3.75f, 10.3636f)
                curveTo(3.75f, 10.7779f, 3.4142f, 11.1136f, 3.0f, 11.1136f)
                curveTo(2.5858f, 11.1136f, 2.25f, 10.7779f, 2.25f, 10.3636f)
                lineTo(2.25f, 8.9979f)
                curveTo(2.25f, 8.564f, 2.25f, 8.1595f, 2.2532f, 7.7846f)
                curveTo(2.2568f, 7.3704f, 2.5955f, 7.0375f, 3.0097f, 7.0411f)
                close()
                moveTo(3.0f, 12.8864f)
                curveTo(3.4142f, 12.8864f, 3.75f, 13.2222f, 3.75f, 13.6364f)
                lineTo(3.75f, 15.0f)
                curveTo(3.75f, 15.4362f, 3.75f, 15.8347f, 3.7532f, 16.2024f)
                curveTo(3.7568f, 16.6166f, 3.4239f, 16.9553f, 3.0097f, 16.9589f)
                curveTo(2.5955f, 16.9625f, 2.2568f, 16.6296f, 2.2532f, 16.2154f)
                curveTo(2.25f, 15.8405f, 2.25f, 15.4359f, 2.25f, 15.0021f)
                lineTo(2.25f, 13.6364f)
                curveTo(2.25f, 13.2222f, 2.5858f, 12.8864f, 3.0f, 12.8864f)
                close()
                moveTo(3.0546f, 18.3712f)
                curveTo(3.4502f, 18.2483f, 3.8705f, 18.4693f, 3.9934f, 18.8648f)
                curveTo(4.0932f, 19.186f, 4.2275f, 19.4095f, 4.409f, 19.591f)
                curveTo(4.5905f, 19.7725f, 4.814f, 19.9068f, 5.1352f, 20.0066f)
                curveTo(5.5307f, 20.1295f, 5.7517f, 20.5498f, 5.6288f, 20.9454f)
                curveTo(5.5059f, 21.341f, 5.0856f, 21.562f, 4.69f, 21.439f)
                curveTo(4.1746f, 21.2788f, 3.7279f, 21.0312f, 3.3484f, 20.6517f)
                curveTo(2.9688f, 20.2721f, 2.7212f, 19.8254f, 2.561f, 19.31f)
                curveTo(2.4381f, 18.9144f, 2.659f, 18.4941f, 3.0546f, 18.3712f)
                close()
                moveTo(7.0411f, 20.9903f)
                curveTo(7.0447f, 20.5761f, 7.3834f, 20.2432f, 7.7976f, 20.2468f)
                curveTo(8.1653f, 20.25f, 8.5638f, 20.25f, 9.0f, 20.25f)
                horizontalLineTo(9.9091f)
                curveTo(10.3233f, 20.25f, 10.6591f, 20.5858f, 10.6591f, 21.0f)
                curveTo(10.6591f, 21.4142f, 10.3233f, 21.75f, 9.9091f, 21.75f)
                horizontalLineTo(8.9977f)
                curveTo(8.5639f, 21.75f, 8.1594f, 21.75f, 7.7846f, 21.7468f)
                curveTo(7.3704f, 21.7432f, 7.0375f, 21.4045f, 7.0411f, 20.9903f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(2.25f)
                lineTo(13.0564f, 2.25f)
                curveTo(14.8942f, 2.25f, 16.3498f, 2.25f, 17.489f, 2.4031f)
                curveTo(18.6614f, 2.5608f, 19.6104f, 2.8929f, 20.3588f, 3.6412f)
                curveTo(21.1071f, 4.3896f, 21.4392f, 5.3386f, 21.5969f, 6.511f)
                curveTo(21.75f, 7.6502f, 21.75f, 9.1058f, 21.75f, 10.9436f)
                verticalLineTo(13.0564f)
                curveTo(21.75f, 14.8942f, 21.75f, 16.3498f, 21.5969f, 17.489f)
                curveTo(21.4392f, 18.6614f, 21.1071f, 19.6104f, 20.3588f, 20.3588f)
                curveTo(19.6104f, 21.1071f, 18.6614f, 21.4392f, 17.489f, 21.5969f)
                curveTo(16.3498f, 21.75f, 14.8942f, 21.75f, 13.0564f, 21.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(21.0004f)
                lineTo(11.25f, 3.0016f)
                lineTo(11.25f, 3.0f)
                lineTo(11.25f, 2.9984f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(12.75f, 3.75f)
                lineTo(12.75f, 20.25f)
                horizontalLineTo(13.0f)
                curveTo(14.9068f, 20.25f, 16.2615f, 20.2484f, 17.2891f, 20.1102f)
                curveTo(18.2952f, 19.975f, 18.8749f, 19.7213f, 19.2981f, 19.2981f)
                curveTo(19.7213f, 18.8749f, 19.975f, 18.2952f, 20.1102f, 17.2892f)
                curveTo(20.2484f, 16.2615f, 20.25f, 14.9068f, 20.25f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(20.25f, 9.0932f, 20.2484f, 7.7385f, 20.1102f, 6.7108f)
                curveTo(19.975f, 5.7048f, 19.7213f, 5.1251f, 19.2981f, 4.7019f)
                curveTo(18.8749f, 4.2787f, 18.2952f, 4.025f, 17.2892f, 3.8898f)
                curveTo(16.2615f, 3.7516f, 14.9068f, 3.75f, 13.0f, 3.75f)
                horizontalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _mirrorRight!!
    }

private var _mirrorRight: ImageVector? = null
