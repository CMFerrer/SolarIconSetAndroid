package dev.chiksmedina.solar.broken.security

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
import dev.chiksmedina.solar.broken.SecurityGroup

val SecurityGroup.ObjectScan: ImageVector
    get() {
        if (_objectScan != null) {
            return _objectScan!!
        }
        _objectScan = Builder(
            name = "ObjectScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 14.0f)
                curveTo(22.0f, 14.3492f, 22.0f, 14.6822f, 21.9991f, 15.0f)
                moveTo(14.0f, 22.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(21.4816f, 20.1752f, 21.7706f, 19.3001f, 21.8985f, 18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 22.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 10.0f)
                curveTo(2.0f, 9.6508f, 2.0f, 9.3178f, 2.0009f, 9.0f)
                moveTo(10.0f, 2.0f)
                curveTo(6.2288f, 2.0f, 4.3432f, 2.0f, 3.1716f, 3.1716f)
                curveTo(2.5184f, 3.8248f, 2.2294f, 4.6999f, 2.1015f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 2.0f)
                curveTo(17.7712f, 2.0f, 19.6569f, 2.0f, 20.8284f, 3.1716f)
                curveTo(22.0f, 4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 11.5f)
                curveTo(4.0f, 11.5f, 6.4f, 9.5f, 12.0f, 9.5f)
                curveTo(17.6f, 9.5f, 20.0f, 11.5f, 20.0f, 11.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.25f, 10.0f)
                curveTo(5.25f, 10.4142f, 5.5858f, 10.75f, 6.0f, 10.75f)
                curveTo(6.4142f, 10.75f, 6.75f, 10.4142f, 6.75f, 10.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(17.4142f, 6.0858f)
                lineTo(16.8839f, 6.6161f)
                lineTo(16.8839f, 6.6161f)
                lineTo(17.4142f, 6.0858f)
                close()
                moveTo(10.0f, 6.25f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.75f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.75f, 10.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(5.25f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(17.25f, 9.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.75f)
                verticalLineTo(9.5f)
                horizontalLineTo(17.25f)
                close()
                moveTo(14.0f, 6.25f)
                curveTo(14.964f, 6.25f, 15.6116f, 6.2516f, 16.0946f, 6.3165f)
                curveTo(16.5561f, 6.3786f, 16.7536f, 6.4858f, 16.8839f, 6.6161f)
                lineTo(17.9445f, 5.5555f)
                curveTo(17.4891f, 5.1f, 16.9223f, 4.9143f, 16.2945f, 4.8299f)
                curveTo(15.6883f, 4.7484f, 14.9216f, 4.75f, 14.0f, 4.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(18.75f, 9.5f)
                curveTo(18.75f, 8.5784f, 18.7516f, 7.8117f, 18.6701f, 7.2055f)
                curveTo(18.5857f, 6.5777f, 18.4f, 6.0109f, 17.9445f, 5.5555f)
                lineTo(16.8839f, 6.6161f)
                curveTo(17.0142f, 6.7464f, 17.1214f, 6.9439f, 17.1835f, 7.4054f)
                curveTo(17.2484f, 7.8884f, 17.25f, 8.536f, 17.25f, 9.5f)
                horizontalLineTo(18.75f)
                close()
                moveTo(10.0f, 4.75f)
                curveTo(9.0784f, 4.75f, 8.3117f, 4.7484f, 7.7055f, 4.8299f)
                curveTo(7.0777f, 4.9143f, 6.5109f, 5.1f, 6.0555f, 5.5555f)
                lineTo(7.1161f, 6.6161f)
                curveTo(7.2464f, 6.4858f, 7.4439f, 6.3786f, 7.9054f, 6.3165f)
                curveTo(8.3884f, 6.2516f, 9.036f, 6.25f, 10.0f, 6.25f)
                verticalLineTo(4.75f)
                close()
                moveTo(6.75f, 9.5f)
                curveTo(6.75f, 8.536f, 6.7516f, 7.8884f, 6.8165f, 7.4054f)
                curveTo(6.8786f, 6.9439f, 6.9858f, 6.7464f, 7.1161f, 6.6161f)
                lineTo(6.0555f, 5.5555f)
                curveTo(5.6f, 6.0109f, 5.4143f, 6.5777f, 5.3299f, 7.2055f)
                curveTo(5.2484f, 7.8117f, 5.25f, 8.5784f, 5.25f, 9.5f)
                horizontalLineTo(6.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 18.5f)
                curveTo(15.8856f, 18.5f, 16.8284f, 18.5f, 17.4142f, 17.9142f)
                curveTo(18.0f, 17.3284f, 18.0f, 16.3856f, 18.0f, 14.5f)
                verticalLineTo(14.0f)
                moveTo(10.0f, 18.5f)
                curveTo(8.1144f, 18.5f, 7.1716f, 18.5f, 6.5858f, 17.9142f)
                curveTo(6.0f, 17.3284f, 6.0f, 16.3856f, 6.0f, 14.5f)
                verticalLineTo(14.0f)
            }
        }
            .build()
        return _objectScan!!
    }

private var _objectScan: ImageVector? = null
