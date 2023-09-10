package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

val DesignToolsGroup.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) {
            return _alignBottom!!
        }
        _alignBottom = Builder(
            name = "AlignBottom", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.4678f, 2.25f)
                horizontalLineTo(7.5322f)
                curveTo(7.972f, 2.25f, 8.3514f, 2.25f, 8.6627f, 2.2782f)
                curveTo(8.9918f, 2.308f, 9.3178f, 2.3741f, 9.625f, 2.5514f)
                curveTo(9.967f, 2.7489f, 10.2511f, 3.033f, 10.4486f, 3.375f)
                curveTo(10.6259f, 3.6822f, 10.692f, 4.0082f, 10.7218f, 4.3373f)
                curveTo(10.75f, 4.6487f, 10.75f, 5.028f, 10.75f, 5.4678f)
                lineTo(10.75f, 14.5322f)
                curveTo(10.75f, 14.972f, 10.75f, 15.3514f, 10.7218f, 15.6627f)
                curveTo(10.692f, 15.9918f, 10.6259f, 16.3178f, 10.4486f, 16.625f)
                curveTo(10.2511f, 16.967f, 9.967f, 17.2511f, 9.625f, 17.4486f)
                curveTo(9.3178f, 17.6259f, 8.9918f, 17.692f, 8.6627f, 17.7218f)
                curveTo(8.3513f, 17.75f, 7.972f, 17.75f, 7.5322f, 17.75f)
                horizontalLineTo(7.4678f)
                curveTo(7.028f, 17.75f, 6.6487f, 17.75f, 6.3373f, 17.7218f)
                curveTo(6.0082f, 17.692f, 5.6822f, 17.6259f, 5.375f, 17.4486f)
                curveTo(5.033f, 17.2511f, 4.7489f, 16.967f, 4.5514f, 16.625f)
                curveTo(4.3741f, 16.3178f, 4.308f, 15.9918f, 4.2782f, 15.6627f)
                curveTo(4.25f, 15.3514f, 4.25f, 14.972f, 4.25f, 14.5322f)
                lineTo(4.25f, 5.5f)
                curveTo(4.25f, 5.4892f, 4.25f, 5.4785f, 4.25f, 5.4678f)
                curveTo(4.25f, 5.028f, 4.25f, 4.6486f, 4.2782f, 4.3373f)
                curveTo(4.308f, 4.0082f, 4.3741f, 3.6822f, 4.5514f, 3.375f)
                curveTo(4.7489f, 3.033f, 5.033f, 2.7489f, 5.375f, 2.5514f)
                curveTo(5.6822f, 2.3741f, 6.0082f, 2.308f, 6.3373f, 2.2782f)
                curveTo(6.6486f, 2.25f, 7.028f, 2.25f, 7.4678f, 2.25f)
                close()
                moveTo(6.4727f, 3.7721f)
                curveTo(6.2476f, 3.7925f, 6.1659f, 3.8269f, 6.125f, 3.8505f)
                curveTo(6.011f, 3.9163f, 5.9163f, 4.011f, 5.8505f, 4.125f)
                curveTo(5.8269f, 4.1659f, 5.7925f, 4.2476f, 5.7721f, 4.4728f)
                curveTo(5.7507f, 4.7082f, 5.75f, 5.0189f, 5.75f, 5.5f)
                lineTo(5.75f, 14.5f)
                curveTo(5.75f, 14.9811f, 5.7507f, 15.2918f, 5.7721f, 15.5273f)
                curveTo(5.7925f, 15.7524f, 5.8269f, 15.8341f, 5.8505f, 15.875f)
                curveTo(5.9163f, 15.989f, 6.011f, 16.0837f, 6.125f, 16.1495f)
                curveTo(6.1659f, 16.1731f, 6.2476f, 16.2075f, 6.4727f, 16.2279f)
                curveTo(6.7082f, 16.2493f, 7.0189f, 16.25f, 7.5f, 16.25f)
                curveTo(7.9811f, 16.25f, 8.2918f, 16.2493f, 8.5273f, 16.2279f)
                curveTo(8.7524f, 16.2075f, 8.8341f, 16.1731f, 8.875f, 16.1495f)
                curveTo(8.989f, 16.0837f, 9.0837f, 15.989f, 9.1495f, 15.875f)
                curveTo(9.1731f, 15.8341f, 9.2075f, 15.7524f, 9.2279f, 15.5273f)
                curveTo(9.2493f, 15.2918f, 9.25f, 14.9811f, 9.25f, 14.5f)
                lineTo(9.25f, 5.5f)
                curveTo(9.25f, 5.0189f, 9.2493f, 4.7082f, 9.2279f, 4.4728f)
                curveTo(9.2075f, 4.2476f, 9.1731f, 4.1659f, 9.1495f, 4.125f)
                curveTo(9.0837f, 4.011f, 8.989f, 3.9163f, 8.875f, 3.8505f)
                curveTo(8.8341f, 3.8269f, 8.7524f, 3.7925f, 8.5273f, 3.7721f)
                curveTo(8.2918f, 3.7507f, 7.9811f, 3.75f, 7.5f, 3.75f)
                curveTo(7.0189f, 3.75f, 6.7082f, 3.7507f, 6.4727f, 3.7721f)
                close()
                moveTo(16.4678f, 5.25f)
                horizontalLineTo(16.5322f)
                curveTo(16.972f, 5.25f, 17.3514f, 5.25f, 17.6627f, 5.2782f)
                curveTo(17.9918f, 5.308f, 18.3178f, 5.3741f, 18.625f, 5.5514f)
                curveTo(18.967f, 5.7489f, 19.2511f, 6.033f, 19.4486f, 6.375f)
                curveTo(19.6259f, 6.6822f, 19.692f, 7.0082f, 19.7218f, 7.3373f)
                curveTo(19.75f, 7.6486f, 19.75f, 8.028f, 19.75f, 8.4677f)
                verticalLineTo(14.5322f)
                curveTo(19.75f, 14.972f, 19.75f, 15.3514f, 19.7218f, 15.6627f)
                curveTo(19.692f, 15.9918f, 19.6259f, 16.3178f, 19.4486f, 16.625f)
                curveTo(19.2511f, 16.967f, 18.967f, 17.2511f, 18.625f, 17.4486f)
                curveTo(18.3178f, 17.6259f, 17.9918f, 17.692f, 17.6627f, 17.7218f)
                curveTo(17.3514f, 17.75f, 16.972f, 17.75f, 16.5322f, 17.75f)
                horizontalLineTo(16.4678f)
                curveTo(16.028f, 17.75f, 15.6486f, 17.75f, 15.3373f, 17.7218f)
                curveTo(15.0082f, 17.692f, 14.6822f, 17.6259f, 14.375f, 17.4486f)
                curveTo(14.033f, 17.2511f, 13.7489f, 16.967f, 13.5514f, 16.625f)
                curveTo(13.3741f, 16.3178f, 13.308f, 15.9918f, 13.2782f, 15.6627f)
                curveTo(13.25f, 15.3514f, 13.25f, 14.972f, 13.25f, 14.5322f)
                verticalLineTo(8.4678f)
                curveTo(13.25f, 8.028f, 13.25f, 7.6486f, 13.2782f, 7.3373f)
                curveTo(13.308f, 7.0082f, 13.3741f, 6.6822f, 13.5514f, 6.375f)
                curveTo(13.7489f, 6.033f, 14.033f, 5.7489f, 14.375f, 5.5514f)
                curveTo(14.6822f, 5.3741f, 15.0082f, 5.308f, 15.3373f, 5.2782f)
                curveTo(15.6486f, 5.25f, 16.028f, 5.25f, 16.4678f, 5.25f)
                close()
                moveTo(15.4727f, 6.7721f)
                curveTo(15.2476f, 6.7925f, 15.1659f, 6.8269f, 15.125f, 6.8505f)
                curveTo(15.011f, 6.9163f, 14.9163f, 7.011f, 14.8505f, 7.125f)
                curveTo(14.8269f, 7.1659f, 14.7925f, 7.2476f, 14.7721f, 7.4728f)
                curveTo(14.7507f, 7.7082f, 14.75f, 8.0189f, 14.75f, 8.5f)
                verticalLineTo(14.5f)
                curveTo(14.75f, 14.9811f, 14.7507f, 15.2918f, 14.7721f, 15.5273f)
                curveTo(14.7925f, 15.7524f, 14.8269f, 15.8341f, 14.8505f, 15.875f)
                curveTo(14.9163f, 15.989f, 15.011f, 16.0837f, 15.125f, 16.1495f)
                curveTo(15.1659f, 16.1731f, 15.2476f, 16.2075f, 15.4727f, 16.2279f)
                curveTo(15.7082f, 16.2493f, 16.0189f, 16.25f, 16.5f, 16.25f)
                curveTo(16.9811f, 16.25f, 17.2918f, 16.2493f, 17.5273f, 16.2279f)
                curveTo(17.7524f, 16.2075f, 17.8341f, 16.1731f, 17.875f, 16.1495f)
                curveTo(17.989f, 16.0837f, 18.0837f, 15.989f, 18.1495f, 15.875f)
                curveTo(18.1731f, 15.8341f, 18.2075f, 15.7524f, 18.2279f, 15.5273f)
                curveTo(18.2493f, 15.2918f, 18.25f, 14.9811f, 18.25f, 14.5f)
                verticalLineTo(8.5f)
                curveTo(18.25f, 8.0189f, 18.2493f, 7.7082f, 18.2279f, 7.4728f)
                curveTo(18.2075f, 7.2476f, 18.1731f, 7.1659f, 18.1495f, 7.125f)
                curveTo(18.0837f, 7.011f, 17.989f, 6.9163f, 17.875f, 6.8505f)
                curveTo(17.8341f, 6.8269f, 17.7524f, 6.7925f, 17.5273f, 6.7721f)
                curveTo(17.2918f, 6.7507f, 16.9811f, 6.75f, 16.5f, 6.75f)
                curveTo(16.0189f, 6.75f, 15.7082f, 6.7507f, 15.4727f, 6.7721f)
                close()
                moveTo(1.25f, 21.0f)
                curveTo(1.25f, 20.5858f, 1.5858f, 20.25f, 2.0f, 20.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 20.25f, 22.75f, 20.5858f, 22.75f, 21.0f)
                curveTo(22.75f, 21.4142f, 22.4142f, 21.75f, 22.0f, 21.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 21.75f, 1.25f, 21.4142f, 1.25f, 21.0f)
                close()
            }
        }
            .build()
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
