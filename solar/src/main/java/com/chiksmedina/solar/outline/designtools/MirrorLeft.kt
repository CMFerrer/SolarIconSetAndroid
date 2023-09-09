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

public val DesignToolsGroup.MirrorLeft: ImageVector
    get() {
        if (_mirrorLeft != null) {
            return _mirrorLeft!!
        }
        _mirrorLeft = Builder(name = "MirrorLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.3409f, 3.0f)
                curveTo(13.3409f, 2.5858f, 13.6767f, 2.25f, 14.0909f, 2.25f)
                horizontalLineTo(15.0022f)
                curveTo(15.436f, 2.25f, 15.8406f, 2.25f, 16.2154f, 2.2532f)
                curveTo(16.6296f, 2.2568f, 16.9625f, 2.5955f, 16.9589f, 3.0097f)
                curveTo(16.9553f, 3.4239f, 16.6166f, 3.7568f, 16.2024f, 3.7532f)
                curveTo(15.8347f, 3.75f, 15.4362f, 3.75f, 15.0f, 3.75f)
                horizontalLineTo(14.0909f)
                curveTo(13.6767f, 3.75f, 13.3409f, 3.4142f, 13.3409f, 3.0f)
                close()
                moveTo(18.3712f, 3.0546f)
                curveTo(18.4941f, 2.659f, 18.9144f, 2.4381f, 19.31f, 2.561f)
                curveTo(19.8254f, 2.7212f, 20.2721f, 2.9688f, 20.6517f, 3.3484f)
                curveTo(21.0312f, 3.7279f, 21.2788f, 4.1746f, 21.439f, 4.69f)
                curveTo(21.562f, 5.0856f, 21.341f, 5.5059f, 20.9454f, 5.6288f)
                curveTo(20.5498f, 5.7517f, 20.1295f, 5.5307f, 20.0066f, 5.1352f)
                curveTo(19.9068f, 4.814f, 19.7725f, 4.5905f, 19.591f, 4.409f)
                curveTo(19.4095f, 4.2275f, 19.186f, 4.0932f, 18.8648f, 3.9934f)
                curveTo(18.4693f, 3.8705f, 18.2483f, 3.4502f, 18.3712f, 3.0546f)
                close()
                moveTo(20.9903f, 7.0411f)
                curveTo(21.4045f, 7.0375f, 21.7432f, 7.3704f, 21.7468f, 7.7846f)
                curveTo(21.75f, 8.1594f, 21.75f, 8.5639f, 21.75f, 8.9977f)
                verticalLineTo(10.3636f)
                curveTo(21.75f, 10.7778f, 21.4142f, 11.1136f, 21.0f, 11.1136f)
                curveTo(20.5858f, 11.1136f, 20.25f, 10.7778f, 20.25f, 10.3636f)
                verticalLineTo(9.0f)
                curveTo(20.25f, 8.5638f, 20.25f, 8.1653f, 20.2468f, 7.7976f)
                curveTo(20.2433f, 7.3834f, 20.5761f, 7.0447f, 20.9903f, 7.0411f)
                close()
                moveTo(21.0f, 12.8864f)
                curveTo(21.4142f, 12.8864f, 21.75f, 13.2221f, 21.75f, 13.6364f)
                verticalLineTo(15.0023f)
                curveTo(21.75f, 15.436f, 21.75f, 15.8406f, 21.7468f, 16.2154f)
                curveTo(21.7432f, 16.6296f, 21.4045f, 16.9625f, 20.9903f, 16.9589f)
                curveTo(20.5761f, 16.9553f, 20.2433f, 16.6166f, 20.2468f, 16.2024f)
                curveTo(20.25f, 15.8347f, 20.25f, 15.4362f, 20.25f, 15.0f)
                verticalLineTo(13.6364f)
                curveTo(20.25f, 13.2221f, 20.5858f, 12.8864f, 21.0f, 12.8864f)
                close()
                moveTo(20.9454f, 18.3712f)
                curveTo(21.341f, 18.4941f, 21.562f, 18.9144f, 21.439f, 19.31f)
                curveTo(21.2788f, 19.8254f, 21.0312f, 20.2721f, 20.6517f, 20.6517f)
                curveTo(20.2721f, 21.0312f, 19.8254f, 21.2788f, 19.31f, 21.439f)
                curveTo(18.9144f, 21.562f, 18.4941f, 21.341f, 18.3712f, 20.9454f)
                curveTo(18.2483f, 20.5498f, 18.4693f, 20.1295f, 18.8648f, 20.0066f)
                curveTo(19.186f, 19.9068f, 19.4095f, 19.7725f, 19.591f, 19.591f)
                curveTo(19.7725f, 19.4095f, 19.9068f, 19.186f, 20.0066f, 18.8648f)
                curveTo(20.1295f, 18.4693f, 20.5498f, 18.2483f, 20.9454f, 18.3712f)
                close()
                moveTo(16.9589f, 20.9903f)
                curveTo(16.9625f, 21.4045f, 16.6296f, 21.7432f, 16.2154f, 21.7468f)
                curveTo(15.8406f, 21.75f, 15.4361f, 21.75f, 15.0023f, 21.75f)
                horizontalLineTo(14.0909f)
                curveTo(13.6767f, 21.75f, 13.3409f, 21.4142f, 13.3409f, 21.0f)
                curveTo(13.3409f, 20.5858f, 13.6767f, 20.25f, 14.0909f, 20.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4362f, 20.25f, 15.8347f, 20.25f, 16.2024f, 20.2468f)
                curveTo(16.6166f, 20.2432f, 16.9553f, 20.5761f, 16.9589f, 20.9903f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(21.75f)
                horizontalLineTo(10.9436f)
                curveTo(9.1058f, 21.75f, 7.6502f, 21.75f, 6.511f, 21.5969f)
                curveTo(5.3386f, 21.4392f, 4.3896f, 21.1071f, 3.6412f, 20.3588f)
                curveTo(2.8929f, 19.6104f, 2.5608f, 18.6614f, 2.4031f, 17.489f)
                curveTo(2.25f, 16.3498f, 2.25f, 14.8942f, 2.25f, 13.0564f)
                verticalLineTo(10.9436f)
                curveTo(2.25f, 9.1058f, 2.25f, 7.6502f, 2.4031f, 6.511f)
                curveTo(2.5608f, 5.3386f, 2.8929f, 4.3896f, 3.6412f, 3.6412f)
                curveTo(4.3896f, 2.8929f, 5.3386f, 2.5608f, 6.511f, 2.4031f)
                curveTo(7.6502f, 2.25f, 9.1058f, 2.25f, 10.9436f, 2.25f)
                lineTo(11.25f, 2.25f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(11.25f, 3.75f)
                horizontalLineTo(11.0f)
                curveTo(9.0932f, 3.75f, 7.7385f, 3.7516f, 6.7108f, 3.8898f)
                curveTo(5.7048f, 4.025f, 5.1251f, 4.2787f, 4.7019f, 4.7019f)
                curveTo(4.2787f, 5.1251f, 4.025f, 5.7048f, 3.8898f, 6.7108f)
                curveTo(3.7516f, 7.7385f, 3.75f, 9.0932f, 3.75f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(3.75f, 14.9068f, 3.7516f, 16.2615f, 3.8898f, 17.2892f)
                curveTo(4.025f, 18.2952f, 4.2787f, 18.8749f, 4.7019f, 19.2981f)
                curveTo(5.1251f, 19.7213f, 5.7048f, 19.975f, 6.7108f, 20.1102f)
                curveTo(7.7385f, 20.2484f, 9.0932f, 20.25f, 11.0f, 20.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(3.75f)
                close()
            }
        }
        .build()
        return _mirrorLeft!!
    }

private var _mirrorLeft: ImageVector? = null
