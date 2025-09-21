package dev.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.KeyMinimalistic: ImageVector
    get() {
        if (_keyMinimalistic != null) {
            return _keyMinimalistic!!
        }
        _keyMinimalistic = Builder(
            name = "KeyMinimalistic", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.9771f, 14.7904f)
                curveTo(21.6743f, 12.0932f, 21.6743f, 7.7201f, 18.9771f, 5.0229f)
                curveTo(16.2799f, 2.3257f, 11.9068f, 2.3257f, 9.2096f, 5.0229f)
                curveTo(7.4187f, 6.8138f, 6.8169f, 9.3437f, 7.4043f, 11.6311f)
                curveTo(7.4991f, 12.0f, 7.4149f, 12.399f, 7.1456f, 12.6684f)
                lineTo(3.4335f, 16.3804f)
                curveTo(3.1156f, 16.6984f, 2.9594f, 17.1435f, 3.0091f, 17.5904f)
                lineTo(3.2411f, 19.679f)
                curveTo(3.2659f, 19.9017f, 3.3657f, 20.1093f, 3.5241f, 20.2677f)
                lineTo(3.7323f, 20.4759f)
                curveTo(3.8907f, 20.6343f, 4.0983f, 20.7341f, 4.321f, 20.7589f)
                lineTo(6.4096f, 20.9909f)
                curveTo(6.8565f, 21.0406f, 7.3016f, 20.8844f, 7.6196f, 20.5665f)
                lineTo(8.3296f, 19.8565f)
                lineTo(6.5834f, 18.1294f)
                curveTo(6.2889f, 17.8382f, 6.2863f, 17.3633f, 6.5776f, 17.0688f)
                curveTo(6.8689f, 16.7743f, 7.3438f, 16.7717f, 7.6382f, 17.063f)
                lineTo(9.3903f, 18.7958f)
                lineTo(11.3319f, 16.8541f)
                curveTo(11.6013f, 16.5848f, 12.0f, 16.5009f, 12.3689f, 16.5957f)
                curveTo(14.6563f, 17.1831f, 17.1861f, 16.5813f, 18.9771f, 14.7904f)
                close()
                moveTo(12.5858f, 8.5858f)
                curveTo(13.3668f, 7.8047f, 14.6332f, 7.8047f, 15.4142f, 8.5858f)
                curveTo(16.1953f, 9.3668f, 16.1953f, 10.6332f, 15.4142f, 11.4142f)
                curveTo(14.6332f, 12.1953f, 13.3668f, 12.1953f, 12.5858f, 11.4142f)
                curveTo(11.8047f, 10.6332f, 11.8047f, 9.3668f, 12.5858f, 8.5858f)
                close()
            }
        }
            .build()
        return _keyMinimalistic!!
    }

private var _keyMinimalistic: ImageVector? = null
